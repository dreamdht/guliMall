package com.flyfish.guliMall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flyfish.common.utils.PageUtils;
import com.flyfish.guliMall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 18:05:21
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

