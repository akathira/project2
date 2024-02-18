package com.ust.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "helloService")
public class HelloService {
	@Autowired
	HelloWorldImpl hello;   //Dependency Injection
	void callHello() {
		hello.message();
	}
 
}