package com.flyfish.guliMall.member.feign;

import com.flyfish.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @autohr flyfish
 * @date: 2023/3/9 22:36
 * @description:
 */
@FeignClient(value = "guliMall-coupon-5000")
@Service
public interface CouponFeign {
    @RequestMapping("coupon/coupon/member/list")
    public R list();

}
