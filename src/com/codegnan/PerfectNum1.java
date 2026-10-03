package com.codegnan;

import java.util.Scanner;

public class PerfectNum1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a = sc.nextInt();
		int sum = 0;
		
		for(int i=1;i<=a/2;i++) {
			
			if(a%i==0) {
				
				sum=sum+i;	
			}
		}
		
		if(sum ==a) {
		System.out.println("It is perfect Number");	
		}
		
		else {
			System.out.println("It is not perfect Number");
			
		}
		
		sc.close();
	}

}
