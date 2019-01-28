package com.example.demo.mapper;

import com.example.demo.pojo.Permission;
import com.example.demo.pojo.PermissionExample;
import java.util.List;

public interface PermissionMapper {
    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);
}