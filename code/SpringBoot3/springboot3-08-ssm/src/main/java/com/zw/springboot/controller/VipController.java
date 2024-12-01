package com.zw.springboot.controller;

import com.zw.springboot.bean.Vip;
import com.zw.springboot.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VipController {

    @Autowired
    private VipService vipService;

    @ResponseBody
    @GetMapping("/detail/{cn}")
    public Vip detail(@PathVariable("cn") String cardNumber){
        return vipService.findByCardNumber(cardNumber);
    }
}
