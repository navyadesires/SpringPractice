package com.mouritech.ordermanagementsystem.service;

import java.util.List;

import com.mouritech.ordermanagementsystem.model.Order;

public interface OrderService {

	List<Order> getAllOrders();

	void saveOrder(Order theNewOrder);

}