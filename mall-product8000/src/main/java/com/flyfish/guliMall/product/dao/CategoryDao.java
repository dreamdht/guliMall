package com.flyfish.guliMall.product.dao;

import com.flyfish.guliMall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 18:05:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
