package com.account.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home(){
		return "Welcome to the Account App - Home page located at: localhost:8080/index.html";
	}

}
