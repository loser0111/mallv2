package com.wyq.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyq.gulimall.common.utils.PageUtils;
import com.wyq.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author losser0111
 * @email zhuwe0111@163.com
 * @date 2023-11-07 21:45:46
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

