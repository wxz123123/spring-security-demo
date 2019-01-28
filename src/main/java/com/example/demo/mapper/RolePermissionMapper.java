package com.example.demo.mapper;

import com.example.demo.pojo.RolePermission;
import com.example.demo.pojo.RolePermissionExample;
import java.util.List;

public interface RolePermissionMapper {
    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    List<RolePermission> selectByExample(RolePermissionExample example);
}