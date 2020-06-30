package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.autowiring.Student;
import com.annotation.autowiring.Student1;

public class Annotation_Autowired_Stu {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/Beans.xml");
		Student1 std = (Student1) context.getBean("std");
		//std.getStudentDetails();
	}
}