package com.codegnan.corejava.threads;

public class CounterDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		
		//thread1
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<10000;i++) {
					counter.increment();
				}
			}
			
		});
		
		
         //thread2
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<10000;i++) {
					counter.increment();
				}
			}
			
		});
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println("Final Count:"+counter.getCount());
	}
}
