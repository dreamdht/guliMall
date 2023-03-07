package com.flyfish.guliMall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flyfish.common.utils.PageUtils;
import com.flyfish.guliMall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 17:40:23
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

