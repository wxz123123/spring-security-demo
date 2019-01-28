package com.example.demo.mapper;

import com.example.demo.pojo.UserRole;
import com.example.demo.pojo.UserRoleExample;
import java.util.List;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> selectByExample(UserRoleExample example);
}