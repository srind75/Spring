package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.nested.Employee;

public class Nested_Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		Employee emp = (Employee) context.getBean("emp");
		emp.displayEmpDetails();
	}
}