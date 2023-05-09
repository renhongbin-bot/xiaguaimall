package com.bin.mallcoupon;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/*
* 1.如何使用nacos作为配置中心统一管理配置
* 1)引入依赖spring-cloud-starter-alibaba-nacos-config
* 2)application.yml配置:
* spring.cloud.nacos.config.server-addr: 127.0.0.1:8848
* management.endpoints.web.exposure.include: '*'
* 3)给配置中心添加一个数据集(dataId):nacos-config-example.properties
* 4)使用@RefreshScope结合@Value实现热更新配置(动态刷新配置)
* 5)该应用版本中如果application.properties中与nacos配置中心有相同的配置项,优先使用的是application.properties,有的版本是优先使用nacos
* 2.细节:
* 1)命名空间:配置隔离;
* 	默认: public(保留空间);默认新增的所有配置都在public空间.
* 	1.开发,测试,生产:利用命名空间做环境隔离
* 	2.每一个微服务之间相互隔离,每一个微服务都创建自己的命名空间,只加载自己命名空间下的所有配置
* 2)配置集: 所有配置的集合
* 3)配置集ID: 类似文件名
* 4)配置分组: 默认所有的配置集都属于:DEFAULT_GROUP, 1111, 618, 1212
*
* 每个微服务创建自己的命名空间,使用配置分组区分环境
*
* 3.同时加载多个配置集
* 1) 微服务任何配置信息,任何配置文件都可以放在配置中心中
* 2)只需要在bootstrap.properties说明加载中心配置哪些文件即可
* 3)
* */
@SpringBootApplication
@EnableDiscoveryClient
public class MallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallCouponApplication.class, args);
	}

}
