package com.codegnan.corejava.controlflow;


//write a program to print a right angle triangle pattern
/** using*(stars or asterisk) */

/*
* 
* *
* * *
* * * */
public class PatternDemo1 {

	public static void main(String[] args) {
		
		//specify the number of rows
		int rows = 5;
		int rowstars=5;
		
		//outer for loop to control the number of rows
		for(int i=1;i<=rows;i++) {
			
			//Inner for loop prints stars equal to current row number
			for(int j=1;j<rowstars;j++) {
				
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
