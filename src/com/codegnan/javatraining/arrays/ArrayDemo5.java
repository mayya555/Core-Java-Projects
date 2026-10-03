package com.codegnan.javatraining.arrays;

public class ArrayDemo5 {

	public static void main(String[] args) {
		int b[] = {100,30,50,78,98};
		
		int max = b[0];
		int min = b[0];
		
		for(int i=0;i<b.length;i++) {
			if(max<b[i]) {
				max=b[i];
			}
			if(min>b[i]) {
				min=b[i];
			}
			
			
		}
		System.out.println("the maximum number is:"+max);
		System.out.println("the minimum number is:"+min);

	}

}
