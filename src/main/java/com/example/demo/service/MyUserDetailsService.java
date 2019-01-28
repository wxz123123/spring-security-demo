package com.example.demo.service;

import com.example.demo.pojo.Role;
import com.example.demo.pojo.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/1/14.
 */
@Component
@Slf4j
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("------------------------------MyUserDetailsService start---------------------------");
        //根据用登录名获取用户信息
        UserInfo userInfo=userService.getUserInfoByUsername(username);
        if(userInfo == null){
            throw new UsernameNotFoundException("用户不存在");
        }

        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        //获取角色权限
        List<Role> roles=roleService.getAllRolesByUserId(userInfo.getUserid());
        for (Role role:roles) {
            authorities.add(new SimpleGrantedAuthority(role.getCode()));
        }
        User user=new User(username,userInfo.getPassword(),true,true,true,true,authorities);
        return user;
    }
}
