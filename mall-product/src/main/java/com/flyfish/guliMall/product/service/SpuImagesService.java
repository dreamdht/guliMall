package com.flyfish.guliMall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flyfish.common.utils.PageUtils;
import com.flyfish.guliMall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 18:05:20
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

