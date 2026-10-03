package com.codegnan.corejava.exceptionhandling;

public class Demo {

	public static void main(String[] args) {
		
		int total_marks = 500;
		int total_subjects = 0;
		int marks_Array[] = new int[2];
		
		try {
			
			//division of a number with zero
			
			marks_Array[0] = 100;
			marks_Array[1] = 200;
			marks_Array[2] = 40; //ArrayIndexOutOfBoundsException
			int average_marks = total_marks/total_subjects; //Arithmetic exception
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Problem occured due to invalid input");
		}
		
		System.out.println("Average marks calculated");

	}

}
