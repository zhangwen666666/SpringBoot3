package com.zw.springboot.service;


import com.zw.springboot.bean.Vip;

import java.util.List;

public interface VipService {
    Vip findById(Long id);
    List<Vip> findAll();
}
