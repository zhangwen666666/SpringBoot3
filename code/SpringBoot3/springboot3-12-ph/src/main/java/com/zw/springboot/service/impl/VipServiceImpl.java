package com.zw.springboot.service.impl;

import com.zw.springboot.bean.Vip;
import com.zw.springboot.mapper.VipMapper;
import com.zw.springboot.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private VipMapper vipMapper;

    @Override
    public Vip findById(Long id) {
        return vipMapper.selectById(id);
    }

    @Override
    public List<Vip> findAll() {
        return vipMapper.selectAll();
    }
}
