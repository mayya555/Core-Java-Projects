package com.codegnan.corejava.threads.producerconsumer;

public class Producer {

	private MessageBox messageBox;
	
	public Producer(MessageBox messageBox) {
		this.messageBox = messageBox;
	}
	
	public void run() {
		
		try {
		messageBox.produce("Hello");
		messageBox.produce("How are you");
		messageBox.produce("Welcome to java Threads");
		
	}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
