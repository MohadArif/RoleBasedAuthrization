package com.RoleBaseSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	public String HomeAccess() {
		return "<h1>welcome to SpringSecurity world...!</h1>";
	}
	
	@GetMapping("/user")
	public String UserAccess() {
		return "<h1>welcome User thankyou for visitng...!</h1>";
	}
	
	@GetMapping("/admin")
	public String AdminAccess() {
		return "<h1>welcome Admin thankyou for visitng...!</h1>";
	}
}
