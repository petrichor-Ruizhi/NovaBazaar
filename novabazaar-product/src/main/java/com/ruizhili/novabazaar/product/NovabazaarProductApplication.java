package com.ruizhili.novabazaar.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 *   1. 整合MyBatis-plus
 *   	1）导入依赖
 *   		<dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *   	2) 配置
 *   		1）配置数据源
 *   			1. 导入数据库的驱动
 *   			2. 在application.yml配置数据源相关信息
 *   		2）配置MyBatis-plus
 *   			1. 使用@MapperScan扫描dao文件
 *   			2. 告诉MyBatis-plus：sql映射文件的位置
 *	  2. 逻辑删除
 *	  	1) 配置全局逻辑删除规则
 *	  		mybatis-plus:
 *   			global-config:
 *     			db-config:
 *       			logic-delete-field: flag # 全局逻辑删除的实体字段名(since 3.3.0,配置后可以忽略不配置步骤2)
 *       			logic-delete-value: 1 # 逻辑已删除值(默认为 1)
 *       			logic-not-delete-value: 0 # 逻辑未删除值(默认为 0)
 *		2) 配置逻辑删除的组件Bean（省略）
 * 		3) 给Bean加上逻辑删除注解@TableLogic
 */

@MapperScan("com/ruizhili/novabazaar/product/dao")
@EnableDiscoveryClient
@SpringBootApplication
public class NovabazaarProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovabazaarProductApplication.class, args);
	}

}
