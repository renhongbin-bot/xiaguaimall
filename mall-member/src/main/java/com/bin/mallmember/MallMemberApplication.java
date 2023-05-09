package com.bin.mallmember;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/*
* 1.想要远程调用别的服务
* 1）引入open-feign
* 2）编写一个接口告诉spring-cloud 这个接口需要调用远程服务
*   声明接口的每一个方法都是调用哪个服务的请求
* 3) 开启远程调用功能
* */
@EnableFeignClients(basePackages = "com.bin.mallmember.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class MallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallMemberApplication.class, args);
	}

}
