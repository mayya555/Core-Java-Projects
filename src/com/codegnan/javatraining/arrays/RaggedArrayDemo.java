package com.codegnan.javatraining.arrays;

public class RaggedArrayDemo {

	public static void main(String[] args) {
		/*
		 10 30  //2 elements in row 0
		 20 30 40  // 3 elements in row 1
		 60 // 1 element in row 2 
		 70 80 90 100 // 4 elements in row 3
		 */
		
		//creating and initializing a ragged array 
		int [][] mArray = 
			    {{10,30},
				{20,30,40},
				{60},
				{70,80,90,100}
			    };
		
		//outer for loop to manage the rows 
		for(int i=0;i<mArray.length;i++) {
			
			System.out.println("Row" + i);
			
			System.out.println("Number of rows:" + mArray[i].length);
			
			for(int j=0;j<mArray[i].length;j++) {
				
				System.out.print(mArray[i][j] + " ");
			}System.out.println();
				
		}
	}

}
