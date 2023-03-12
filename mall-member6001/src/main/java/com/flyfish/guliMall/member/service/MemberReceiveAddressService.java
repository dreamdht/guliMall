package com.flyfish.guliMall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flyfish.common.utils.PageUtils;
import com.flyfish.guliMall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 17:36:55
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

