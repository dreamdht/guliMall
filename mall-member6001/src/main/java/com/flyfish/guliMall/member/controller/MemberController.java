package com.flyfish.guliMall.member.controller;

import com.flyfish.common.utils.PageUtils;
import com.flyfish.common.utils.R;
import com.flyfish.guliMall.member.entity.MemberEntity;
import com.flyfish.guliMall.member.feign.CouponFeign;
import com.flyfish.guliMall.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 会员
 *
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 17:36:55
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private CouponFeign couponFeign;

    /*测试Feign*/
    @RequestMapping("/feign")
    public R feignTest(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("小明");
        memberEntity.setJob("苦逼的程序员");
        R list = couponFeign.list();
        return R.ok().put("member",memberEntity).put("coupon",list.get("coupons"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
