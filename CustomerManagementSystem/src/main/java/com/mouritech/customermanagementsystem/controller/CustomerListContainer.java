package com.mouritech.customermanagementsystem.controller;

import java.util.List;

import com.mouritech.customermanagementsystem.model.Customer;

public class CustomerListContainer {

	
	private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}