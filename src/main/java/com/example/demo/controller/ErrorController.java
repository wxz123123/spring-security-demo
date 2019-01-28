package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2019/1/23.
 */
@Controller
public class ErrorController {

    /**
     * 未授权（无权限）界面
     */
    @GetMapping("/unauthorized")
    public String unauthorized(){
        return "unauthorized";
    }
}
