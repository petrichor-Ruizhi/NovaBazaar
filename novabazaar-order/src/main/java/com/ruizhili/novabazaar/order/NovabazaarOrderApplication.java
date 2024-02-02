package com.ruizhili.novabazaar.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com/ruizhili/novabazaar/order/dao")
@SpringBootApplication
public class NovabazaarOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovabazaarOrderApplication.class, args);
	}

}
