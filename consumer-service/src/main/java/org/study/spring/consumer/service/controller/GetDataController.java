package org.study.spring.consumer.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/getData")
@RestController
public class GetDataController {

	@Value("${spring.application.name}")
	private String name;

	@GetMapping("/getName")
	public String getName() {
		return name;
	}
}
