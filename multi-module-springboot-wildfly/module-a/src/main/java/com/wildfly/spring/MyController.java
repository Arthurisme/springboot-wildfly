package com.wildfly.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@RequestMapping("/hello")
	public String sayHello() {
		
		return "Hello, This is Module spring-jboss running on WildFly";
		
	}

	
	
}
