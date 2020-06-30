package com.spring.beans;

import org.springframework.context.annotation.Bean;

public class HelloBeanConfig {

	@Bean
	public HelloBeanJavaBasedConfig helloBeanJavaBasedConfig() {
		return new HelloBeanJavaBasedConfig();
	}

}
