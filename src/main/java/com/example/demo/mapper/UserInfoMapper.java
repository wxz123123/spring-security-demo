package com.example.demo.mapper;

import com.example.demo.pojo.UserInfo;
import com.example.demo.pojo.UserInfoExample;
import java.util.List;

public interface UserInfoMapper {
    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);
}