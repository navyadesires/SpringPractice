package com.mouritech.ordermanagementsystemwithrestcontroller.service;

import java.util.List;

import com.mouritech.ordermanagementsystemwithrestcontroller.entity.Order;
import com.mouritech.ordermanagementsystemwithrestcontroller.exception.OrderNotFoundException;





public interface OrderService {

	List<Order> getAllOrders();

	void saveOrder(Order theNewOrder);

	Order getOrder(Long ordid) throws OrderNotFoundException;

	void updateOrder(Long ordid, Order theNewOrder);

	void updateOrderDate(Long ordid, String orddate);

	void updateOrderValue(Long ordid, float ordvalue);

	void deleteOrder(Long ordid);

	

}