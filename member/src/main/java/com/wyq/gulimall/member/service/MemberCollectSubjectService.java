package com.wyq.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyq.gulimall.common.utils.PageUtils;
import com.wyq.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author losser0111
 * @email zhuwe0111@163.com
 * @date 2023-11-07 23:31:18
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

