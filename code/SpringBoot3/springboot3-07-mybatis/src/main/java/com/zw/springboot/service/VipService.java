package com.zw.springboot.service;

import com.zw.springboot.bean.Vip;

import java.util.List;

public interface VipService {
    boolean save(Vip vip);
    List<Vip> findAll();
}
