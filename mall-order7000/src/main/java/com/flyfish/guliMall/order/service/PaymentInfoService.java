package com.flyfish.guliMall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flyfish.common.utils.PageUtils;
import com.flyfish.guliMall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 17:40:22
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

