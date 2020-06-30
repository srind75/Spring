package com.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.beanPostProcessor.Customer;

public class BeanPostProcessorImpl_Test {

	public static void main(String[] args) throws Exception {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/beanPostProcessorImpl.xml");
	//	Customer cust = (Customer) context.getBean("cust");
	//	cust.getCustomerDetails();
		//context.registerShutdownHook();
	}
}