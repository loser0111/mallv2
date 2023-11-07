package com.wyq.gulimall.product.dao;

import com.wyq.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author losser0111
 * @email zhuwe0111@163.com
 * @date 2023-11-07 21:42:39
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
