package com.gy.gulimall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: gaoyang
 * @createTime: 2020-06-01 17:04
 **/

@Data
public class MergeVo {

    private Long purchaseId;

    private List<Long> items;

}
