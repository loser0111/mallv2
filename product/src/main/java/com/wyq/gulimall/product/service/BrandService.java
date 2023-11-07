package com.wyq.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyq.gulimall.common.utils.PageUtils;
import com.wyq.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author losser0111
 * @email zhuwe0111@163.com
 * @date 2023-11-07 21:45:46
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

