package com.gy.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gy.gulimall.product.entity.SpuInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * spu信息
 */
@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {

    void updaSpuStatus(@Param("spuId") Long spuId, @Param("code") int code);
}
