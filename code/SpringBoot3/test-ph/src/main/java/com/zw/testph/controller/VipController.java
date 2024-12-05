package com.zw.testph.controller;


import com.zw.testph.bean.Vip;
import com.zw.testph.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VipController {
    @Autowired
    private VipService vipService;

    @GetMapping("/hello")
    public String hello(){
        return "HELLO!!!!";
    }

    @GetMapping("detail/{id}")
    public Vip detail(@PathVariable ("id") Long id){
        return vipService.findById(id);
    }
}
