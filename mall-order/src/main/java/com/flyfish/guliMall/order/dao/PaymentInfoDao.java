package com.flyfish.guliMall.order.dao;

import com.flyfish.guliMall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 17:40:22
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
