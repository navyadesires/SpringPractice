package com.mouritech.javabasedconfigurationspringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.javabasedconfigurationspringdemo.config.AppConfiguration;
import com.mouritech.javabasedconfigurationspringdemo.entity.PrimeCustomer;

public class TestJavaConfiguration {

	public static void main(String[] args) {
		ApplicationContext appContext = 
				new AnnotationConfigApplicationContext(AppConfiguration.class);
		PrimeCustomer pservice = (PrimeCustomer) appContext.getBean("pService");
		pservice.showCustomerDetails();
	}

}
