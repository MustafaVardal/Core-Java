package com.springdemo.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springdemo.demo")
@PropertySource("classpath:values.properties")
public class IocConfig {
	
	@Bean
	public ICustomerDal database() {
		return new MySqlCustomerDal();
	}
	
	@Bean ICustomerService service() {
		return new CustomerManager(database());
	}

}