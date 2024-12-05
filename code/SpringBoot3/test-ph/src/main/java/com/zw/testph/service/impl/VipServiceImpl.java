package com.zw.testph.service.impl;

import com.zw.testph.bean.Vip;
import com.zw.testph.mapper.VipMapper;
import com.zw.testph.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipServiceImpl implements VipService {
    @Autowired
    private VipMapper mapper;

    @Override
    public Vip findById(Long id) {
        return mapper.selectById(id);
    }

    @Override
    public List<Vip> findAll() {
        return mapper.selectAll();
    }
}
