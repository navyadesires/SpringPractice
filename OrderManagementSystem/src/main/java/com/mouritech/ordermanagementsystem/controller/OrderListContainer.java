package com.mouritech.ordermanagementsystem.controller;

import java.util.List;

import com.mouritech.ordermanagementsystem.model.Order;

public class OrderListContainer {
	
	 private List<Order> orders;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}