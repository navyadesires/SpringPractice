package com.mouritech.ordermanagementswithspringdatajpa.service;

import java.util.List;

import com.mouritech.ordermanagementswithspringdatajpa.entity.Order;
import com.mouritech.ordermanagementswithspringdatajpa.exception.OrderNotFoundException;



public interface OrderService {

	List<Order> getAllOrders();

	void saveOrder(Order theNewOrder);

	Order getOrder(Long ordid) throws OrderNotFoundException;

	void deleteOrder(Long ordid);

}