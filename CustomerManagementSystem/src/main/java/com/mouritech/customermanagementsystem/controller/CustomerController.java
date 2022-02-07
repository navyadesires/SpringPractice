package com.mouritech.customermanagementsystem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.mouritech.customermanagementsystem.model.Customer;
import com.mouritech.customermanagementsystem.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService custService;

	
	 @GetMapping("/showForm")
	 public String showFormForAdd(Model model) {
		 Customer newCust = new Customer();
		 model.addAttribute("customer", newCust);
		return "customerform";
		 
	 }
	 
	 @PostMapping("/saveCustomer")
	 public String saveOrder(@ModelAttribute("customer") Customer theNewCustomer) {
		 custService.saveCustomer(theNewCustomer);
		 return "redirect:/customer/listcustomers";
	 }
	

	@RequestMapping(value = "/listcustomers")
	  public String getUsers(Model model) throws Exception{
	    List<Customer> custs = custService.getAllCustomers();
	    model.addAttribute("Customers", custs);
	    return "customerlist";
	  }
}