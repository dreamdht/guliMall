package com.flyfish.guliMall.product.controller;

import com.flyfish.common.utils.PageUtils;
import com.flyfish.common.utils.R;
import com.flyfish.guliMall.product.entity.CategoryEntity;
import com.flyfish.guliMall.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;



/**
 * 商品三级分类
 *
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 18:05:21
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);

        return R.ok().put("page", page);
    }

    /*查询树状结构list*/
    @RequestMapping("/list/tree")
    public R listTree(){
        List<CategoryEntity> categoryEntities = categoryService.queryListTree();
        return R.ok().put("listTree",categoryEntities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
        // 此删除不安全，需要查看是否有其他字段关联
		// categoryService.removeByIds(Arrays.asList(catIds));

        categoryService.deleteMenus(Arrays.asList(catIds));
        return R.ok();
    }

}
