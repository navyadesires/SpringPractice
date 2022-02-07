package com.mouritech.customermanagementsystem.dao;

import java.util.List;

import com.mouritech.customermanagementsystem.model.Customer;

public interface CustomerDao {

	void saveCustomer(Customer theNewCustomer);

	List<Customer> getAllCustomers();

}