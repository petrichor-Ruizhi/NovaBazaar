package com.ruizhili.novabazaar.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *  要使用网关的功能
 *  	1. 开启服务的注册发现@EnableDiscoveryClient
 *  		（配置nacos的注册中心地址）
 *  	2.
 *
 */


@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // 在pom中排除跟数据源有关的配置
public class NovabazaarGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovabazaarGatewayApplication.class, args);
	}

}
