package com.bin.mallproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bin.mallproduct.entity.BrandEntity;
import com.bin.mallproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();

//		brandEntity.setName("小米");
//		brandService.save(brandEntity);
//		System.out.println("保存成功...");

//		brandEntity.setBrandId(13L);
//		brandEntity.setDescript("小米");
//		brandService.updateById(brandEntity);

		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 11L));
		list.forEach((item) -> {
			System.out.println(item);
		});
	}
}
