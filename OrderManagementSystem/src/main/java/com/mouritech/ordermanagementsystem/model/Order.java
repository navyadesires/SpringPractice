package com.mouritech.ordermanagementsystem.model;

public class Order {
	
	private int orderId;
	private String orderDate;
	private float orderValue;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, String orderDate, float orderValue) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderValue = orderValue;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public float getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(float orderValue) {
		this.orderValue = orderValue;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderValue=" + orderValue + "]";
	}
	
	
}