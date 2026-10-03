package com.codegnan.corejava.threads.producerconsumer;

public class MessageBox {

	private String message;
	
	private boolean messageAvailable = false;
	
	public synchronized void produce(String message) throws InterruptedException {
		
		//if a message is already available , producer must wait
		
		while(messageAvailable) {
			System.out.println("Message is Full, Producer is waiting");
			wait();
		}
		
		//store the new message
		this.message = message;
		
		//MessageBox is now full
		messageAvailable = true;
		System.out.println("Message Produced:"+message);
		//notify the waiting thread - consumer , so that consumer can consume the message
		notifyAll();
	}
	
	
	public synchronized String consume() throws InterruptedException {
		
		//if there is no message, consumer will not do anything, it keeps waiting
		while(!messageAvailable) {
			System.out.println("MessageBox is empty - Consumer is waiting");
			wait();
		}
		
		String receiveMessage = message;
		System.out.println("Consumed:"+receiveMessage);
		
		//after consuming the message,
		messageAvailable = false;
		
		//notify waiting thread - ProducerThread
		notifyAll();
		
		return receiveMessage;
	}
}
