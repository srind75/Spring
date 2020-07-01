package com.produce.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPC {

	public static void main(String[] args) throws InterruptedException {
		ProducerConsumer producerConsumer;

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/produce/consumer/applicationContext.xml");
		producerConsumer = (ProducerConsumer) context.getBean("ProducerConsumer");
		Runnable t1 = () -> {
			producerConsumer.produce();
		};
		Runnable t2 = () -> {
			producerConsumer.consume();
		};
		new Thread(t1).start();
		new Thread(t2).start();

	}

}
