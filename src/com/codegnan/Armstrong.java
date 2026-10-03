package com.codegnan;

public class Armstrong {

	public static void main(String[] args) {
		//153=1*1*1+5*5*5+3*3*3=153//
		//1234=1*1*1*1+2*2*2*2+3*3*3*3+4*4*4*4//
		int n=153;
		int temp=n;
		int sum=0;
		int count=0;
		while(temp>0) {
			int rem=temp%10;
		    sum=sum+(rem*rem*rem);
		    temp=temp/10;
		    
		}if(sum==n) {
			System.out.println("it is armstrong");
		}else {
			System.out.println("it is not armstrong");
		}

	}

}
