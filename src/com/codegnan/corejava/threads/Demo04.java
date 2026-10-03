package com.codegnan.corejava.threads;

public class Demo04 {

	public static void main(String[] args) {
		
		//create a runnable object
        Thread t = new Thread(task);

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
 t.start();
        

	}

}
