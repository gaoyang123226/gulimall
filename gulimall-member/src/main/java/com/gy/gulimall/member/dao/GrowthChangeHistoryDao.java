package com.gy.gulimall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gy.gulimall.member.entity.GrowthChangeHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author gaoyang
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:42:06
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
