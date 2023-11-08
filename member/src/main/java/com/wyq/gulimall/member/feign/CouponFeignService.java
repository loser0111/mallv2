package com.wyq.gulimall.member.feign;

import com.wyq.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


// 调用feign服务
@FeignClient("guli-coupon") //注册在nacos中的服务名称
public interface CouponFeignService {

    // 用RequestMapping写全请求的信息
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();

}
