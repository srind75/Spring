package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.HelloBeanConfig;
import com.spring.beans.HelloBeanJavaBasedConfig;

public class HelloBeanJavaBasedConfigTestRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("HelloBeanConfig.class");
		HelloBeanJavaBasedConfig bean = (HelloBeanJavaBasedConfig)context.getBean("helloBeanJavaBasedConfig");
		System.out.println(bean.sayHello());
	}

	///com/spring/beans/HelloBeanConfig.class
}
