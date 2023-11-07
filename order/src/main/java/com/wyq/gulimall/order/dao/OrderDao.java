package com.wyq.gulimall.order.dao;

import com.wyq.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author losser0111
 * @email zhuwe0111@163.com
 * @date 2023-11-07 23:39:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
