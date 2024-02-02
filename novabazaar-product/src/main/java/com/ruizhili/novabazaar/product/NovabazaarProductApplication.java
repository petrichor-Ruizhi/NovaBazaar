package com.ruizhili.novabazaar.product;

import com.ruizhili.novabazaar.product.service.BrandService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *   1. 整合MyBatis-plus
 *   	1）导入依赖
 *   2. 配置
 *   	1）配置数据源
 *   		1. 导入数据库的驱动
 *   		2. 在application.yml配置数据源相关信息
 *   	2）配置MyBatis-plus
 *   		1. 使用@MapperScan扫描dao文件
 *   		2. 告诉MyBatis-plus：sql映射文件的位置
 */

@EnableDiscoveryClient
@MapperScan("com/ruizhili/novabazaar/product/dao")
@SpringBootApplication
public class NovabazaarProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovabazaarProductApplication.class, args);
	}

}
