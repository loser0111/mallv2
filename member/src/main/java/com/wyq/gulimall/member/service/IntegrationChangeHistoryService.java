package com.wyq.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyq.gulimall.common.utils.PageUtils;
import com.wyq.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author losser0111
 * @email zhuwe0111@163.com
 * @date 2023-11-07 23:31:18
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

