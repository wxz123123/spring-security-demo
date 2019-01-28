package com.example.demo.service;

import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.pojo.UserInfo;
import com.example.demo.pojo.UserInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/1/14.
 */
@Service
public class UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    public UserInfo getUserInfoByUsername(String username) {
        UserInfoExample userInfoExample=new UserInfoExample();
        UserInfoExample.Criteria criteria=userInfoExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<UserInfo> userInfos= userInfoMapper.selectByExample(userInfoExample);
        if (userInfos!=null && userInfos.size()>0){
            return userInfos.get(0);
        }
        return  null;
    }

    public List<UserInfo> getAllUser() {
        UserInfoExample userInfoExample=new UserInfoExample();
        return userInfoMapper.selectByExample(userInfoExample);
    }

    public int addUser(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }
}
