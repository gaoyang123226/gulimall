package com.gy.gulimall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gy.gulimall.coupon.entity.SeckillSkuRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseMapper<SeckillSkuRelationEntity> {
	
}
