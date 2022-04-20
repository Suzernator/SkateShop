package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Customer;
import dmacc.beans.Inventory;
import dmacc.beans.Item;
import dmacc.beans.Order;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Customer contact() {
		Customer bean = new Customer();
		return bean;
	}
	@Bean
	public Inventory inventory() {
		Inventory inventory = new Inventory();
		return inventory;
	}
	@Bean
	public Order order() {
		Order order = new Order();
		return order;
	}
	@Bean
	public Item item() {
		Item item = new Item();
		return item;
	}

//
}
