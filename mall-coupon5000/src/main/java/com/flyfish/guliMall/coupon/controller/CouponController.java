package com.flyfish.guliMall.coupon.controller;

import com.flyfish.common.utils.PageUtils;
import com.flyfish.common.utils.R;
import com.flyfish.guliMall.coupon.entity.CouponEntity;
import com.flyfish.guliMall.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 优惠券信息
 *
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 17:26:41
 */
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    /*测试OpenFeign*/
    @RequestMapping("/member/list")
    public R list(){
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("618d大促销,iPhone系列全场半价");
        return R.ok().put("coupons",couponEntity);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
