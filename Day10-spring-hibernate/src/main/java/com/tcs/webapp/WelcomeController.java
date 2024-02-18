package com.tcs.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/go")
public class WelcomeController {

	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public String method() {
		System.out.println("From Controller");
		return "welcome"; // view name
	}
    
	@PostMapping("/go2")
	public String method2() {
		System.out.println("From Controller");
		return "welcome"; // view name
	}

	
	@GetMapping("/go2")
	public String method3(Model model) {
		model.addAttribute("Welcome", "Hi Welcome to TCS");
		System.out.println("From Controller");
		return "welcome"; // view name
	}
}