package com.codegnan.corejava.threads.producerconsumer;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		
		//Create One MessageBox object
		//the same object must be given to
		//Producer and Consumer
		MessageBox messagebox = new MessageBox();
		
		//Create a Producer Thread
		Producer producer = new Producer(messageBox);
		producer.setName("Producer");
		
		//Create a Consumer Thread
		Consumer consumer = new Consumer(messageBox);
		consumer.setName("Consumer");
		
		//start consumer thread
		consumer.start();
	}
}
