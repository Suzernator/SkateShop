package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dmacc.repository.CustomerRepository;

@Controller
public class WebController {

	@Autowired
	CustomerRepository repo; 
	
	@GetMapping("/viewAll")
	public String viewAllCustomers(Model model) {
		model.addAttribute("customers", repo.findAll()); 
	}
	
	
}
