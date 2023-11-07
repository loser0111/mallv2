package com.wyq.gulimall.product.dao;

import com.wyq.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author losser0111
 * @email zhuwe0111@163.com
 * @date 2023-11-07 21:45:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
