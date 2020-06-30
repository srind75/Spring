package com.spring.beans.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		System.out.println("postProcessAfterInitialization()");
		Customer cust = (Customer) bean;
		cust.setCmobile("1-9988776655");
		return cust;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		System.out.println("postProcessBeforeInitialization()");
		Customer cust = (Customer) bean;
		cust.setCemail("test@gmail.com");
		return cust;
	}
}