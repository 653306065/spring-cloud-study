package org.study.spring.consumer.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.study.spring.consumer.service.feign.FirstServiceFeign;
import org.study.spring.consumer.service.servcie.GetDataServcie;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class Application  {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=   SpringApplication.run(Application.class, args);
		GetDataServcie getDataServcie=  configurableApplicationContext.getBean(GetDataServcie.class);
		FirstServiceFeign firstServiceFeign=  configurableApplicationContext.getBean(FirstServiceFeign.class);
		System.out.println(getDataServcie.getData());
		System.out.println(firstServiceFeign.getValue());
	}
}
