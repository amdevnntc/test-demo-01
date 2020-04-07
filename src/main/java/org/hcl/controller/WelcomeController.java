package org.hcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/")
	public String showform() {
		return "welcome";
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello Docker";
	}

}
