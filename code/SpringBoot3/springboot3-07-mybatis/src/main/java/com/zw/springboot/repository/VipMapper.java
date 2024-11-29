package com.zw.springboot.repository;

import com.zw.springboot.bean.Vip;

import java.util.List;

public interface VipMapper {
    int insert(Vip vip);

    List<Vip> selectAll();
}
