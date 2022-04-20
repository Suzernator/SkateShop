package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Customer;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.CustomerRepository;

@SpringBootApplication
public class SkateShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkateShopApplication.class, args);
	}
	
	@Autowired
	CustomerRepository repo;
	
	public void run(String...args)throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		List<Customer> allCustomers = repo.findAll();
		for(Customer customers: allCustomers) {
			System.out.println(customers.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
}
