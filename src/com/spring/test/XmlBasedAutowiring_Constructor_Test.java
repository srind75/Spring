package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xml.autowiring.EmployeeConst;

public class XmlBasedAutowiring_Constructor_Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContextXmlBasedAutowritingConstructor.xml");
		EmployeeConst emp = (EmployeeConst) context.getBean("emp");
		emp.getEmpDetails();
	}
}