package com.mouritech.springdiexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mouritech.springdiexample.config.AppConfiguration;
import com.mouritech.springdiexample.fieldbaseddi.FieldBasedInjection;

public class TestFieldInjection {
	
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfiguration.class);
		FieldBasedInjection field = container.getBean(FieldBasedInjection.class);
		field.selectShape("i am using field based shape example.......");
	}

}