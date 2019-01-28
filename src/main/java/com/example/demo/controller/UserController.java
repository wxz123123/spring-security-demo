package com.example.demo.controller;

import com.example.demo.pojo.BaseResult;
import com.example.demo.pojo.UserInfo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/1/23.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    /**
     * 新用户注册
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/register")
    public BaseResult register(@RequestParam("username")String username,@RequestParam("password")String password){
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            return BaseResult.error("用户名或密码不能为空！");
        }
        //对密码进行加密
        password=bCryptPasswordEncoder.encode(password);
        //封装要插入数据库的数据
        UserInfo userInfo=new UserInfo();
        userInfo.setUsername(username);
        userInfo.setPassword(password);
        //将用户信息插入数据库
        userService.addUser(userInfo);
        return BaseResult.ok();
    }

    /**
     * 获取所有用户
     * @return
     */
    @Secured("ROLE_ADMIN")//此方法只允许 ADMIN 角色访问,ROLE_前缀是必须加的
    @GetMapping("/list/user")
    public BaseResult userList(){
        List<UserInfo> users=userService.getAllUser();
        return BaseResult.ok(users);
    }
}
