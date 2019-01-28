package com.example.demo.service;

import com.example.demo.mapper.RoleMapper;
import com.example.demo.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/1/21.
 */
@Service
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public List<Role> getAllRolesByUserId(Integer userId){
        List<Role> roles=roleMapper.getAllRolesByUserId(userId);
        return roles;
    }
}
