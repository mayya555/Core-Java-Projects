package com.codegnan.corejava.threads;

public class WithJoinDemo {

	public static void main(String[] args) {
		
		DownloadTask task  = new DownloadTask();
		task.start();
		
		try {
			task.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// main thread will execute the below
		Thread.currentThread().setName("Main thread");
		System.out.println(Thread.currentThread().getName()+ "Processing downloaded file");

	}

}
