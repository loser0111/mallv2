package com.wyq.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyq.gulimall.common.utils.PageUtils;
import com.wyq.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author losser0111
 * @email zhuwe0111@163.com
 * @date 2023-11-07 23:39:33
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

