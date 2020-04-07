package org.hcl.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	public String showform() {
		return "welcome";
	}

}
