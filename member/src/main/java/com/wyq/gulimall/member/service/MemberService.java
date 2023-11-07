package com.wyq.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyq.gulimall.common.utils.PageUtils;
import com.wyq.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author losser0111
 * @email zhuwe0111@163.com
 * @date 2023-11-07 23:31:18
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

