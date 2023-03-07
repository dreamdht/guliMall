package com.flyfish.guliMall.product;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.flyfish.guliMall.product.entity.BrandEntity;
import com.flyfish.guliMall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @autohr flyfish
 * @date: 2023/3/7 14:03
 * @description:
 */
@SpringBootTest
public class MallProductApplication {
    @Autowired
    private BrandService brandService;

    @Test
    public void demo01(){
        List<BrandEntity> list = brandService.list();
        list.forEach(System.out::println);
    }

    @Test
    public void demo02(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为Mate30");
        brandEntity.setDescript("麒麟990 5G加持");
        brandService.save(brandEntity);
        System.out.println(brandService.getById(1L));
        System.out.println("============>"+brandService);
    }
}
