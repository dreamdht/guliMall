package com.flyfish.guliMall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.flyfish.common.utils.PageUtils;
import com.flyfish.common.utils.Query;
import com.flyfish.guliMall.product.dao.CategoryDao;
import com.flyfish.guliMall.product.entity.CategoryEntity;
import com.flyfish.guliMall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );
        return new PageUtils(page);
    }


    @Override
    public List<CategoryEntity> queryListTree() {
        /*查询所有数据*/
        List<CategoryEntity> entities = baseMapper.selectList(null);

        /*找到一级分类*/
        List<CategoryEntity> levelMenus = entities.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == 0;
        }).map((menu) -> {
            menu.setChildren(getChildren(menu, entities));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu1.getSort());
        }).collect(Collectors.toList());

        return levelMenus;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid().intValue() == root.getCatId();
        }).map((categoryEntity) -> {
            categoryEntity.setChildren(getChildren(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu1.getSort());
        }).collect(Collectors.toList());

        return children;
    }

    @Override
    public boolean deleteMenus(List<Long> asList) {
        //TODO 维护该删除功能，删除前判断是否有其他属性关联
        int i = baseMapper.deleteBatchIds(asList);
        return i != 0;
    }


}