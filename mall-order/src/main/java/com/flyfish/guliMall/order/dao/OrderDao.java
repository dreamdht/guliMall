package com.flyfish.guliMall.order.dao;

import com.flyfish.guliMall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 17:40:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
