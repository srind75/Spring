package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.autowiring.Student;

public class AnnotationAutowiring {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/annotationAutowiring.xml");
		Student std = (Student) context.getBean("std");
		std.getStudentDetails();
	}
}