package org.first.service.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getData")
public class GetDataController {

	@GetMapping("getValue")
	public String getValue() {
		return UUID.randomUUID().toString();
	}
}
