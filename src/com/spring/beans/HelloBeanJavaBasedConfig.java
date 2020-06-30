package com.spring.beans;

public class HelloBeanJavaBasedConfig {

	static {
		System.out.println("Bean Loading.....");
	}

	public HelloBeanJavaBasedConfig() {
		System.out.println("Bean Created....");
		}

	public String sayHello() {

		return "Hello User";
	}
}
