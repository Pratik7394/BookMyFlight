package com.springboot.bookmytickets.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	//expose  "/" that return "Welcome to BookMyTickets"
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to BookMyTickets, your one stop destination for flying to the destination  of your dreams";
	}
	
	@GetMapping("/info")
	public String showAppInfo() {
		return "Created by Rachit Shah";
	}
}
