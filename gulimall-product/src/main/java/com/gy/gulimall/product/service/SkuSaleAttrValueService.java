package com.gy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gy.common.utils.PageUtils;
import com.gy.gulimall.product.entity.SkuSaleAttrValueEntity;
import com.gy.gulimall.product.vo.SkuItemSaleAttrVo;


import java.util.List;
import java.util.Map;

/**
 * sku销售属性&值
 *

 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<SkuItemSaleAttrVo> getSaleAttrBySpuId(Long spuId);

    List<String> getSkuSaleAttrValuesAsStringList(Long skuId);
}

