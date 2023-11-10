package com.wyq.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wyq.gulimall.common.utils.PageUtils;
import com.wyq.gulimall.common.utils.Query;

import com.wyq.gulimall.product.dao.CategoryDao;
import com.wyq.gulimall.product.entity.CategoryEntity;
import com.wyq.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }


    /**
     * 查出所有的分类并进行树形组装
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        // 首先查出来所有的分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        // 找到一级分类
        List<CategoryEntity> level1Menus = categoryEntities.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid() == 0;
        }).map((menu) -> {
            menu.setChildren(getChildren(menu, categoryEntities));
            return menu;
        }).sorted((m1, m2) -> {
            return (m1.getSort() == null ? 0 : m1.getSort()) - (m2.getSort() == null ? 0 : m2.getSort()); // 处理空指针异常
        }).collect(Collectors.toList());

        return level1Menus;
    }


    // 从列表当中收集这个分类的所有子分类
    private List<CategoryEntity> getChildren(CategoryEntity parent, List<CategoryEntity> list){
        return list.stream().filter((categoryEntity -> {
            return categoryEntity.getParentCid() == parent.getCatId();
        })).map((menu) -> { // 可能存在递归调用
            menu.setChildren(getChildren(menu, list));
            return menu;
        }).sorted((m1, m2) -> { // 排序
            return (m1.getSort() == null ? 0 : m1.getSort()) - (m2.getSort() == null ? 0 : m2.getSort()); // 处理空指针异常
        }).collect(Collectors.toList());
    }

}