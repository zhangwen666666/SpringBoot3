package com.zw.testph.mapper;

import com.zw.testph.bean.Vip;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface VipMapper {
    Vip selectById(Long id);
    List<Vip> selectAll();
}
