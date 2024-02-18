package com.tcs.webapp2;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping(path = "/go")
public class WelcomeController {
	@RequestMapping(method = RequestMethod.GET)
	public String method(){
		System.out.println("From Controller");
		return "welcome"; //view name
	}
 
}