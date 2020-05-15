package org.study.spring.consumer.service.servcie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class GetDataServcie {

	@Autowired
	RestTemplate  restTemplate;
	
	@HystrixCommand(fallbackMethod = "getDataError")
	public String getData() {
		return restTemplate.getForObject("http://FIRST-SERVICE/getData/getValue", String.class);
	}
	
	public String getDataError() {
		return "出错了";
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
