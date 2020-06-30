package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.collection.Student;

public class Collection_Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContextCollection.xml");
		Student std = (Student) context.getBean("std");
		std.getStudentDeails();
	}
}
