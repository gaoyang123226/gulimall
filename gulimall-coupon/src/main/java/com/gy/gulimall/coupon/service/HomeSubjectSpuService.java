package com.gy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gy.common.utils.PageUtils;
import com.gy.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author gaoyang
 * @email
 * @date
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

