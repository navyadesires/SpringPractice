package com.mouritech.ordermanagementsystem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mouritech.ordermanagementsystem.model.Order;
import com.mouritech.ordermanagementsystem.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	

	@Autowired
	private OrderService ordService;

	//@RequestMapping(value = "/listorder", method = RequestMethod.GET)
	 @GetMapping("/listorder")
	  public String getUsers(Model model) throws Exception{
	    List<Order> ordersList = ordService.getAllOrders();
	    model.addAttribute("Orders", ordersList);
	    return "orderlist";
	  }
	 
	 @GetMapping("/showForm")
	 public String showFormForAdd(Model model) {
		 Order newOrder = new Order();
		 model.addAttribute("order", newOrder);
		return "orderform";
		 
	 }
	 
	 @PostMapping("/saveOrder")
	 public String saveOrder(@ModelAttribute("order") Order theNewOrder) {
		 ordService.saveOrder(theNewOrder);
		 return "redirect:/oms/order/listorder";
	 }
}