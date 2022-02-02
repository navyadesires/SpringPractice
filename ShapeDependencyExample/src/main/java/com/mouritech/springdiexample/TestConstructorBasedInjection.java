package com.mouritech.springdiexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.springdiexample.config.AppConfiguration;
import com.mouritech.springdiexample.constructordi.ConstructorBasedDIExample;

public class TestConstructorBasedInjection {
	
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		ConstructorBasedDIExample con = container.getBean(ConstructorBasedDIExample.class);
	con.selectShape("i am using contructor practce program");
	}

}