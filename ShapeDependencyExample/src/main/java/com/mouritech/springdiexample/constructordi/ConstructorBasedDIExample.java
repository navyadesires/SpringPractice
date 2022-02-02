package com.mouritech.springdiexample.constructordi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.Shape;

@Component
public class ConstructorBasedDIExample {


	private Shape shape;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	@Autowired
	public ConstructorBasedDIExample(@Qualifier("square")Shape shape) {
		super();
		this.shape = shape;
	}

	public ConstructorBasedDIExample() {
		super();
		// TODO Auto-generated constructor stub
	}
	
public void selectShape(String sha) {
		
		shape.selectShape(sha);
	}
}
