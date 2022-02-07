package com.mouritech.customermanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "custId")
	private int custId;
	@Column(name = "custName")
	private String custName;
	@Column(name = "custAddress")
	private String custAddress;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + "]";
	}
	public Customer(int custId, String custName, String custAddress) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}