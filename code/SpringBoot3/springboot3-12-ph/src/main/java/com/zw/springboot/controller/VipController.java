package com.zw.springboot.controller;

import com.zw.springboot.bean.Vip;
import com.zw.springboot.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VipController {

    @Autowired
    private VipService vipService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello!!!!";
    }

    @GetMapping("/detail/{id}")
    @ResponseBody
    public Vip vip(@PathVariable("id") Long id){
        return vipService.findById(id);
    }
}
