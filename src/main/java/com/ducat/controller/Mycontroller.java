package com.ducat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {

	@GetMapping(value= "/")
	public String home() {
		System.out.println("Showing home page to the user.");
		return "home";
	}

	@GetMapping(value= "/login" )
	public String login() {
		System.out.println("Showing login page to the user.");
		return "login";
	}
}