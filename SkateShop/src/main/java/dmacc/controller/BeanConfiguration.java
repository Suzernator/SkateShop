package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Customer;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Customer contact() {
		Customer bean = new Customer();
		return bean;
	}

//
}
