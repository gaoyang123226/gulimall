package com.gy.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gy.gulimall.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
