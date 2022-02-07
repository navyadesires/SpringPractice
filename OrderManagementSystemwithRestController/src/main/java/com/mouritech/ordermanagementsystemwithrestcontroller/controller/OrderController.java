package com.mouritech.ordermanagementsystemwithrestcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.mouritech.ordermanagementsystemwithrestcontroller.entity.Order;
import com.mouritech.ordermanagementsystemwithrestcontroller.exception.OrderNotFoundException;
import com.mouritech.ordermanagementsystemwithrestcontroller.service.OrderService;

@RestController
@RequestMapping("/api/v1")
public class OrderController {
	
	@Autowired
	private OrderService ordService;
	
	@PostMapping("/order") 
	public ResponseEntity<?> saveOrder(@RequestBody Order theNewOrder) {
		ordService.saveOrder(theNewOrder);
		return ResponseEntity.ok().body("New order added successfully");
	}
	
	@GetMapping("/order")
	public ResponseEntity<List<Order>> getAllOrders() {
		List<Order> orderList = ordService.getAllOrders();
		return ResponseEntity.ok().body(orderList);
	}
	
	@PutMapping("/order/{oid}")
	public ResponseEntity<?> updateOrder(@PathVariable("oid") Long ordid,@RequestBody Order theNewOrder ) throws OrderNotFoundException {
		//Order existingOrder = null;
		 ordService.updateOrder(ordid,theNewOrder);
		return ResponseEntity.ok().body("Order updated successfully");
		
	 }

	@PutMapping("/order/{oid}/{odate}")
	public ResponseEntity<?> updateOrderDate(@PathVariable("oid") Long ordid,
			@PathVariable("odate") String orddate) throws OrderNotFoundException {
		//Order existingOrder = null;orddate
		 ordService.updateOrderDate(ordid,orddate);
		return ResponseEntity.ok().body("Order updated successfully");
		
	 }
	
	@PutMapping("/ordervalue/{oid}/{ovalue}")
	public ResponseEntity<?> updateOrderValue(@PathVariable("oid") Long ordid,
			@PathVariable("ovalue") float ordvalue) throws OrderNotFoundException {
		//Order existingOrder = null;orddate
		 ordService.updateOrderValue(ordid,ordvalue);
		return ResponseEntity.ok().body("Order updated successfully");
		
	 }
	
	@GetMapping("/order/{oid}")
	public ResponseEntity<Order> getOrder(@PathVariable("oid") Long ordid) throws OrderNotFoundException {
		Order order = ordService.getOrder(ordid);
		return ResponseEntity.ok().body(order);
	}
	
	@DeleteMapping("/order/{oid}")
	public ResponseEntity<?> deleteOrder(@PathVariable("oid") Long ordid) throws OrderNotFoundException {
		ordService.deleteOrder(ordid);
		return ResponseEntity.ok().body("Order deleted successfully");
	}

}