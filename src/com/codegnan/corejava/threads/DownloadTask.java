package com.codegnan.corejava.threads;

public class DownloadTask extends Thread{
	
	@Override
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
