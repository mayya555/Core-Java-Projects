package com.codegnan.corejava.controlflow.whiledemo;


//print the sum of first 5 numbers - 1+2+3+4+5 = 15



public class WhileDemo {

	public static void main(String[] args) {
		int i = 1;
		
		int sum = 0;
		
		while(i<=5) {
			
			sum = sum + i;
			
			i++;//i=i+1;
			
			
		}
		
		System.out.println("Sum:"+sum);

	}

}
