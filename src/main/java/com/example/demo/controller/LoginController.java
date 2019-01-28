//package com.example.demo.controller;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// * Created by Administrator on 2019/1/21.
// */
//@Controller
//@Slf4j
//public class LoginController {
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    /**
//     * 自定义登录认证
//     * @param username
//     * @param password
//     */
//    @RequestMapping("/login")
//    public void login(@RequestParam("username")String username,@RequestParam("password") String password){
//        log.info("------------------------------login start---------------------------");
//        UsernamePasswordAuthenticationToken token=new UsernamePasswordAuthenticationToken(username,password);
//        // 执行登录认证过程
//        Authentication authentication = authenticationManager.authenticate(token);
//        // 认证成功存储认证信息到上下文
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//    }
//}
