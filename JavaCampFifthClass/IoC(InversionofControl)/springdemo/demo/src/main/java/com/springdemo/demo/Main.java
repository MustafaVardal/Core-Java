package com.springdemo.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		
		//context.refresh();
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.add();
		
		//SpringApplication.run(DemoApplication.class, args);
	}

}
