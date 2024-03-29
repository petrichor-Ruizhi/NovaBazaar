package com.ruizhili.novabazaar.product;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.ruizhili.novabazaar.product.entity.BrandEntity;
import com.ruizhili.novabazaar.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/**
 * 将图像上传至阿里云OSS步骤：
 * 		1. 引入oss-starter
 * 		2. 配置key，endpoint相关信息即可
 * 		3. 使用OSSClient 进行相关操作
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class NovabazaarProductApplicationTests {

//	@Autowired
//	BrandService brandService;


//	@Test
//	public void contextLoads() {
//
//		BrandEntity brandEntity = new BrandEntity();
//
////		插入测试
////		brandEntity.setName("Apple");
////		brandService.save(brandEntity);
////		System.out.println("Successfully saved....");
//
////		修改测试
////		brandEntity.setBrandId(1L);
////		brandEntity.setDescript("iPhone 15 Pro Max 512G dark grey");
////		brandService.updateById(brandEntity);
//
////		查询测试
//		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//		list.forEach((item) -> {
//			System.out.println(item);
//		});
//	}

}
