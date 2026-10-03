package com.codegnan.corejava.threads;

public class WithOutJoin {

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
		Thread.

	}

}
