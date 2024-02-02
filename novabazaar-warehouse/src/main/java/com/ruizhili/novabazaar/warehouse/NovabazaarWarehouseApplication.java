package com.ruizhili.novabazaar.warehouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@MapperScan("com/ruizhili/novabazaar/warehouse/dao")
@SpringBootApplication
public class NovabazaarWarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovabazaarWarehouseApplication.class, args);
	}

}
