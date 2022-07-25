package com.chainsys.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Service {
	@RequestMapping("/hello")
	public String welcomePage() {
		return "<h1>Welcome to Spring Boot</h1>";
	}

	@RequestMapping("/welcome")
	public String homePage() {
		String html = "<div>Spring Boot is an open source, microservice-based Java web framework. "
				+ "The Spring Boot framework creates a fully production-ready environment that is "
				+ "completely configurable using its prebuilt code within its codebase</div>";
		return html;
	}

	@RequestMapping("/getdata")
	public String getData(@RequestParam(value = "city",defaultValue = "Thanjur")String city) {
		return "<h1>Welcome to "+city+"</h1>";
	}
}
