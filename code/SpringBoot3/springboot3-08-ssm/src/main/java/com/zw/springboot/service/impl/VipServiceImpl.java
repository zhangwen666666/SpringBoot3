package com.zw.springboot.service.impl;

import com.zw.springboot.bean.Vip;
import com.zw.springboot.repository.VipMapper;
import com.zw.springboot.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private VipMapper mapper;

    @Override
    public Vip findById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public Vip findByCardNumber(String cardNumber) {
        return mapper.selectByCardNumber(cardNumber);
    }
}
