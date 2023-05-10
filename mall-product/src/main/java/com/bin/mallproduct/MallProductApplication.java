package com.bin.mallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
* 1.整合mybatis-plus
* 		1)配置数据源:
* 			导入数据库驱动ing；
*			在application.yml配置数据源相关信息
* 		2)配置mybatis-plus
* 			使用@MapperScan
* 			告诉mybatis-plus sql映射文件位置
* 2.逻辑删除
* 	1）配置全局逻辑删除的规则（可以省略）
* 	2）配置逻辑删除的组件Bean（可以省略）
* 	3）加上逻辑删除的注解@TableLogic
* */
@MapperScan("com.bin.mallproduct.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class MallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallProductApplication.class, args);
	}

}
