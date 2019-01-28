package com.example.demo.mapper;

import com.example.demo.pojo.Role;
import com.example.demo.pojo.RoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    List<Role> getAllRolesByUserId(@Param("userId") Integer userId);
}