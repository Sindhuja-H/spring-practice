package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/user/show")
	public String showMessage() {
		return "hello";
	}
	@GetMapping("/user/greet")
	public String greet() {
		return "Great Day";
	}
	@GetMapping("/edit")
	public String editProduct() {
		return "edited";
	}
	@GetMapping("/add")
	public String addProduct() {
		return "added";
	}
}
