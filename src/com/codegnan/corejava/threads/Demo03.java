package com.codegnan.corejava.threads;

public class Demo03 {

	public static void main(String[] args) {
		
		//DownloadTask thread will execute downloading task
		DownloadTask download = new DownloadTask();
		
		//wrong
		//download.run();
		download.start();  
		
		//main thread will execute the user work.. for loop
		for(int i=1;i<=5;i++) {
			System.out.println("User is working..."+ i);
		}
	}
}
