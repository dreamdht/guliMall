package com.flyfish.guliMall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flyfish.common.utils.PageUtils;
import com.flyfish.guliMall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 17:26:41
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

