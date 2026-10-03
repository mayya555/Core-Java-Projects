package com.codegnan.corejava.threads.producerconsumer;

public class InterThreadDemo {
	
	public static volatile boolean running = true;

	public static void main(String[] args) throws InterruptedException {
		//Runnable Thread
		Thread worker = new Thread(new Runnable() {
			
			public void run() {
				
				System.out.println("Worker thread started");
				while(running) {
					//System.out.println("in while loop");
				}
				System.out.println("Worker thread stopped");
			}//run() closing
		}//runnable closing
		);//Thread constructor closing
		
		worker.start();
		
		Thread.sleep(2000);
		System.out.println("Main thread changing running variable to false");
		
		//main thread changing the value of running variable to false
		running = false;
		

	}

}
