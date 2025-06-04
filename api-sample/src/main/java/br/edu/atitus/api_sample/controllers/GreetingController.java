package br.edu.atitus.api_sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	@GetMapping("/{namePath}")
	public String getGreeting(
			@RequestParam(required = false) String name,
			@PathVariable(required = false) String namePath) {
		if (name == null)
			name = namePath != null ? namePath : "World";
		String returnGreeting = String.format("%s %s!", "Hello", name);
		return returnGreeting;
	}
}
