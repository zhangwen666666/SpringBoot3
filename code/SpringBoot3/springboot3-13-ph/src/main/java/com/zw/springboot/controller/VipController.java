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

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable("name") String name){
        return "Hello " + name;
    }

    @GetMapping("/detail/{id}")
    @ResponseBody
    public Vip detail(@PathVariable("id") Long id){
        Vip vip = vipService.findVipById(id);
        return vip;
    }
}
