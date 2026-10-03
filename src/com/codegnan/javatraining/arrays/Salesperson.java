package com.codegnan.javatraining.arrays;

public class Salesperson {

	public static void main(String[] args) {
		
		
		int [][] sales =
			    {{12000,15000,18000},
				{10000,11000,14000},
				{17000,16000,19000},
				{13000,12500,14500}};
		
		
		int a =0;
		int total =0;
		for(int i =0;i<sales.length;i++) {
			a=0;
			
			for(int j = 0;j<sales[i].length;j++) {
				
				System.out.print(sales[i][j] +" ");
				
				total += sales[i][j];
				a += sales[i][j];
				
			}System.out.println();
			
			System.out.println("Grand total for single sales person: " +a);
			
		}System.out.println("Grand total for all sales persons: " +total);

	}

}
