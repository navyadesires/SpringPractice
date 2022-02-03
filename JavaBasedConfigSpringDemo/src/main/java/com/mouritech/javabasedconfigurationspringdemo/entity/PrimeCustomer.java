package com.mouritech.javabasedconfigurationspringdemo.entity;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service("pService")
public class PrimeCustomer implements CustomerService  {

	public void showCustomerDetails() {
		System.out.println("customer details are ............");
		
	}

}