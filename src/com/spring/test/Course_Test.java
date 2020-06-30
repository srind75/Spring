package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.constructor.di.Course;

public class Course_Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/constructorDependencyInjectionApplicationContext.xml");
		Course course = (Course)context.getBean("crs123");
		course.getCourseDetails();
	}
}
