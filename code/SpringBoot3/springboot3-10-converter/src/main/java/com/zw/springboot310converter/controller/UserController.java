package com.zw.springboot310converter.controller;

import com.zw.springboot310converter.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @GetMapping("/detail")
    @ResponseBody
    public User getUser(){
        return new User("zhangsan", 30);
    }
}
