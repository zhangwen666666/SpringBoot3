package com.zw.springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zw.springboot.bean.Vip;
import com.zw.springboot.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class VipController {

    @Autowired
    private VipService vipService;

    @GetMapping("/list/{pageNo}")
    @ResponseBody
    public PageInfo<Vip> list(@PathVariable("pageNo") Integer pageNo){
        PageHelper.startPage(pageNo, 2);
        List<Vip> vips = vipService.findAll();
        PageInfo<Vip> vipPageInfo = new PageInfo<>(vips);
        return vipPageInfo;
    }

    @GetMapping("/hello")
    @ResponseBody
    public List<Vip> vips(){
        List<Vip> vips = vipService.findAll();
        return vips;
    }

    @GetMapping("/hi")
    @ResponseBody
    public Vip vip(){
        List<Vip> vips = vipService.findAll();
        return vips.get(0);
    }
}
