package com.zw.springboot.mapper;

import com.zw.springboot.bean.Vip;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface VipMapper {
    Vip selectById(Long id);
    List<Vip> selectAll();
}
