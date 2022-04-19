/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Apr 18, 2022
 */
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

	@GetMapping("addcustomer")
	public String addCustomer(Model model) {
		model.addAttribute("customers", repo()); 
	}
}
