package com.zw.springboot.service.impl;

import com.zw.springboot.bean.Vip;
import com.zw.springboot.repository.VipMapper;
import com.zw.springboot.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipServiceImpl implements VipService {
    @Autowired
    private VipMapper vipMapper;

    @Override
    public Vip findVipById(Long id) {
        return vipMapper.selectVipById(id);
    }

    @Override
    public List<Vip> findAll() {
        return vipMapper.selectAllVip();
    }
}
