package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestController {

	@RequestMapping("/test")
	public String index() {
		return "You are @ <string>Test Controller!!!</strong><br/><i>bazinga domain</i>";
	}

}