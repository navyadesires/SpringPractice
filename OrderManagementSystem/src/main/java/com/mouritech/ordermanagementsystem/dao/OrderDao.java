package com.mouritech.ordermanagementsystem.dao;

import java.util.List;

import com.mouritech.ordermanagementsystem.model.Order;

public interface OrderDao {

	List<Order> getAllOrders();

	void saveOrder(Order theNewOrder);

}