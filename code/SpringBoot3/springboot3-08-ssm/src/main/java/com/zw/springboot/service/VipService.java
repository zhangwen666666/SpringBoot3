package com.zw.springboot.service;

import com.zw.springboot.bean.Vip;

public interface VipService {
    Vip findById(Long id);
    Vip findByCardNumber(String cardNumber);
}
