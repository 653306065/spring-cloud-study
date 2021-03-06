package org.study.spring.consumer.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.study.spring.consumer.service.hystrix.FirstServiceHystrix;

@FeignClient(name = "first-service",fallback = FirstServiceHystrix.class)
public interface FirstServiceFeign {

    @RequestMapping(value = "/getData/getValue",method = RequestMethod.GET)
    String getValue();
}
