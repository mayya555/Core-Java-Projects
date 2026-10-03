package com.codegnan.corejava.threads;

public class RunnableThread01 implements Runnable{
	
public void run() {
		
		for(int i=1;i<=5;i++) {
			
			System.out.println("Downloading file "+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


	
}
