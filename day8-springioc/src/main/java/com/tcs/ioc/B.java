package com.tcs.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	
	A a; //dependencies
	//beans are called objects, it was created by bean factory.

	
	@Qualifier("a")
	public void other()
	{
		//A a = new A(); 
		a.method(); ///inversion of conversion -> giving the control to another object & should not use new keyword
	}
	
	public void setA(A a)
	{
		this.a=a;
	}
	
	@PostConstruct
	public void start() {
		System.out.println(getClass() + "init method");
	}
	
	@PreDestroy
	public void terminate()
	{
		System.out.println(getClass() + "destroy method");
	}
}
