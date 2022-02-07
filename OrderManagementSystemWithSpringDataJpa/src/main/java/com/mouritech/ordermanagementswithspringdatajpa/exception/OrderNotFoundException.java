package com.mouritech.ordermanagementswithspringdatajpa.exception;

public class OrderNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1337935933969360905L;
	
	public OrderNotFoundException(Object ordid) {
		super(ordid != null ?ordid.toString() : null);
	}

}