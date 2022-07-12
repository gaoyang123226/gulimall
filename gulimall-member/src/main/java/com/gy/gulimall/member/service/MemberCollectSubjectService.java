package com.gy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gy.common.utils.PageUtils;
import com.gy.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author gaoyang
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:42:06
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
