package com.mouritech.customermanagementsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mouritech.customermanagementsystem.dao.CustomerDao;
import com.mouritech.customermanagementsystem.model.Customer;

@Repository
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	private CustomerDao custDao;

	@Transactional
	public void saveCustomer(Customer theNewCustomer) {
		
		custDao.saveCustomer(theNewCustomer);
		
	}

	@Transactional
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return custDao.getAllCustomers();
	}



	
}