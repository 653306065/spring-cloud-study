package org.study.spring.consumer.service.hystrix;

import org.springframework.stereotype.Component;
import org.study.spring.consumer.service.feign.FirstServiceFeign;

@Component
public class FirstServiceHystrix implements FirstServiceFeign {

	@Override
	public String getValue() {
		return "出错了";
	}

}
