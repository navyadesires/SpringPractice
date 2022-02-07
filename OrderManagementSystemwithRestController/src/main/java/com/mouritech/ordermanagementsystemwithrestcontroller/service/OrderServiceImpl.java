package com.mouritech.ordermanagementsystemwithrestcontroller.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.ordermanagementsystemwithrestcontroller.entity.Order;
import com.mouritech.ordermanagementsystemwithrestcontroller.exception.OrderNotFoundException;
import com.mouritech.ordermanagementsystemwithrestcontroller.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Transactional
	public List<Order> getAllOrders() {
		
		return orderRepository.findAll();
	}

	@Transactional
	public void saveOrder(Order theNewOrder) {
		
		orderRepository.save(theNewOrder);
	}

	@Transactional
	public Order getOrder(Long ordid) throws OrderNotFoundException{
		return orderRepository.findById(ordid)
				.orElseThrow(() -> new OrderNotFoundException(ordid));
	}
	
	@Transactional
	public void deleteOrder(Long ordid) {
		orderRepository.deleteById(ordid);
		
	}

	@Override
	@Transactional
	public void updateOrder(Long ordid, Order theNewOrder) {
		Order existingOrder = null;
		try {
			existingOrder = orderRepository.findById(ordid)
					.orElseThrow(() -> new OrderNotFoundException(ordid));
			existingOrder.setOrderValue(theNewOrder.getOrderValue());
			existingOrder.setOrderDate(theNewOrder.getOrderDate());
			orderRepository.save(existingOrder);
		} catch (OrderNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	@Transactional
	public void updateOrderDate(Long ordid, String orddate) {
		Order existingOrder = null;
		try {
			existingOrder = orderRepository.findById(ordid)
					.orElseThrow(() -> new OrderNotFoundException(ordid));
			existingOrder.setOrderDate(orddate);
			orderRepository.save(existingOrder);
		} catch (OrderNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	@Transactional
	public void updateOrderValue(Long ordid, float ordvalue) {
		Order existingOrder = null;
		try {
			existingOrder = orderRepository.findById(ordid)
					.orElseThrow(() -> new OrderNotFoundException(ordid));
			existingOrder.setOrderValue(ordvalue);
			orderRepository.save(existingOrder);
		} catch (OrderNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}