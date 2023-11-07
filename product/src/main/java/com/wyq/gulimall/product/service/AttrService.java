package com.wyq.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyq.gulimall.common.utils.PageUtils;
import com.wyq.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author losser0111
 * @email zhuwe0111@163.com
 * @date 2023-11-07 21:45:46
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

