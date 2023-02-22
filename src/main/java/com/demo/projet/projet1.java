package com.demo.projet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class projet1 {
	
	@GetMapping("/rolk")
	private String projet1() {
		return "mon premier projet spring boot";
	}
}
