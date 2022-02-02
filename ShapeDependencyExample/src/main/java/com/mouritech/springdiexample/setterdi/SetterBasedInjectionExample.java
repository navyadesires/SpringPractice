package com.mouritech.springdiexample.setterdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.Shape;

@Component
public class SetterBasedInjectionExample {
	

	private Shape shape;

	public Shape getShape() {
		return shape;
	}

	@Autowired
	@Qualifier("circle")
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public SetterBasedInjectionExample(Shape shape) {
		super();
		this.shape = shape;
	}

	public SetterBasedInjectionExample() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void selectShape(String sha) {
		
		shape.selectShape(sha);
	}

}