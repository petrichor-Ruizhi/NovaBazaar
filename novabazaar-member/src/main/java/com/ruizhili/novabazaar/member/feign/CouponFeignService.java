package com.ruizhili.novabazaar.member.feign;

import com.ruizhili.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  这是一个声明式的远程调用
 */

@FeignClient("novabazaar-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
