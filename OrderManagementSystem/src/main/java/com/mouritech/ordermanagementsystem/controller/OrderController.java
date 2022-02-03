package com.mouritech.ordermanagementsystem.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mouritech.ordermanagementsystem.model.Order;

@Controller
@RequestMapping("/order")
public class OrderController {
	

	public List<Order> orderList() {
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(100,LocalDateTime.of(2022, 01, 10, 10, 11).toString(),578.73f));
		orders.add(new Order(101,LocalDateTime.of(2022, 10, 11, 12, 10).toString(), 238.23f));
		orders.add(new Order(102,LocalDateTime.of(2022, 05, 04, 12, 10).toString(),578.56f));
		return orders;
		
	}

	@RequestMapping(value = "/listorder", method = RequestMethod.GET)
	  public String getUsers(Model model) throws Exception{
	    List<Order> orders = orderList();
	    OrderListContainer neworderList = new OrderListContainer();
	    neworderList.setOrders(orders);
	    model.addAttribute("Orders", neworderList);
	    return "orderlist";
	  }
}