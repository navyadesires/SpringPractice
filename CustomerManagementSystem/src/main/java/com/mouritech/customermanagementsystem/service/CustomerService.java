package com.mouritech.customermanagementsystem.service;

import java.util.List;

import com.mouritech.customermanagementsystem.model.Customer;

public interface CustomerService {

	void saveCustomer(Customer theNewCustomer);

	List<Customer> getAllCustomers();

}