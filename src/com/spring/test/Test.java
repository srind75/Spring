package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.HelloBean;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		
		HelloBean bean= (HelloBean) context.getBean("helloBean"); 
		//System.out.println(bean.getName());
		System.out.println(bean.sayHello());
	
		

	}

}
