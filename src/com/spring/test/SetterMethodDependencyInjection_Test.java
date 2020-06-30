package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.setterMethodDependencyInjection.Employee;

public class SetterMethodDependencyInjection_Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationConetextSetterMethodDependencyInjection.xml");
		Employee emp = (Employee) context.getBean("emp");
		emp.getEmployeeDetails();
	}
} 