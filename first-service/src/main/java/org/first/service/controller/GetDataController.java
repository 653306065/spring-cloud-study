package org.first.service.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getData")
public class GetDataController {
	
	@Value("${spring.application.name}")
	private String name;

	@GetMapping("getValue")
	public String getValue() {
		return UUID.randomUUID().toString();
	}
	
	@GetMapping("/getName")
	public String getName() {
		return name;
	}
}
