package com.example.demoReplay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
	@GetMapping("")
	public String root() {
		System.out.println("HIT /USERS");
		
		return "users";
	}
}
