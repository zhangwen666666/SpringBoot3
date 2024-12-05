package com.zw.springboot.repository;

import com.zw.springboot.bean.Vip;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface VipMapper {
    List<Vip> selectAll();
}