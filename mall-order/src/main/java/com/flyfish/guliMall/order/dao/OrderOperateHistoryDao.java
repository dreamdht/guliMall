package com.flyfish.guliMall.order.dao;

import com.flyfish.guliMall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 17:40:23
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
