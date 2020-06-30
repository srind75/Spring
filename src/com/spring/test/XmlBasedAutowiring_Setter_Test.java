package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xml.autowiring.Employee;

public class XmlBasedAutowiring_Setter_Test {

	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/spring/resources/applicationContextXmlBasedAutowritingSetter.xml");
		Employee emp=(Employee)context.getBean("emp");
		emp.getEmpDetails();
		}
		

}
