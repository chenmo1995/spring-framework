package com.fudn.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fdn
 * @since 2021-10-11 23:01
 */
@RestController
public class HelloController {
	@GetMapping("/hello")
	public String sayHello() {
		return "HelloSpringMVC!";
	}
}
