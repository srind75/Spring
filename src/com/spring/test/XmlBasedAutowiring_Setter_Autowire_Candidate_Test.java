package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xml.autowiring.Employee;

public class XmlBasedAutowiring_Setter_Autowire_Candidate_Test {

	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/spring/resources/applicationContextXmlBasedAutowritingSetterByTypeAutowiredCandiatexml.xml");
		Employee emp=(Employee)context.getBean("emp");
		emp.getEmpDetails();
		}
		

}
