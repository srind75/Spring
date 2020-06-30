package com.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.inheritance.HelloBean;
import com.spring.beans.inheritance.WelcomeBean;

public class Inheritamce_Test {

//	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/spring_beans_config.xml");
		HelloBean hello = (HelloBean) context.getBean("helloBean");
		System.out.println(hello.sayHello());
		System.out.println();
		WelcomeBean welcome = (WelcomeBean) context.getBean("welcomeBean");
		System.out.println(welcome.sayWelcome());
		context.registerShutdownHook();
	}
}
