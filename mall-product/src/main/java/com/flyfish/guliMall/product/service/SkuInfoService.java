package com.flyfish.guliMall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flyfish.common.utils.PageUtils;
import com.flyfish.guliMall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 18:05:20
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

