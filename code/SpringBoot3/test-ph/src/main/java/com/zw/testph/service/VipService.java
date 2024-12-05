package com.zw.testph.service;

import com.zw.testph.bean.Vip;

import java.util.List;

public interface VipService {
    Vip findById(Long id);
    List<Vip> findAll();
}
