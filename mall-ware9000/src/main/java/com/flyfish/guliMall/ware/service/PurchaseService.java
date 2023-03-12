package com.flyfish.guliMall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flyfish.common.utils.PageUtils;
import com.flyfish.guliMall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 18:16:21
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

