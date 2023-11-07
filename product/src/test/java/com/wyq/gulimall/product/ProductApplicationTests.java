package com.wyq.gulimall.product;

import com.wyq.gulimall.product.entity.BrandEntity;
import com.wyq.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity b = new BrandEntity();
        b.setName("huawei");
        brandService.save(b);
        System.out.println("saving...");
        brandService.list().forEach(
            (brandEntity) -> {
                System.out.println(brandEntity);
            }
        );
    }

}
