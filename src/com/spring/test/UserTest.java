package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.User;

public class UserTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/spring/resources//applicationContext.xml");
		User user123 = (User) context.getBean("user");
		user123.display_User_Details();
	}

}
