package com.codegnan.javatraining.arrays;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {3,4,5,6};
		
		System.out.println("Common Elements");
		//Outer for loop to travel each element of the First Array

		for(int i=0;i<a.length;i++) {
			
			//INNER loop to compare element of array a with every elements
			
			for(int j=0;j<b.length;j++) {
				
				if (a[i] == b[j])
				{
					System.out.println(a[i]);	
				}
				
			}
			
			
		}

	}

}
