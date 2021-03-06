package com.gy.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gy.common.utils.PageUtils;
import com.gy.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author gaoyang
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:55:33
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<PurchaseDetailEntity> listDetailByPurchaseId(Long id);
}

