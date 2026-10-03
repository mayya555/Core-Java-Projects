package com.codegnan.javatraining.arrays;

public class StudentMarksDemo {

	public static void main(String[] args) {
		
		/*
		s1  70[0][0]   80[0][1]
		s2  90[1][0]   70[1][1]
		 */
		
		//create a 2 dimensional int array 
		
		int[][] sMarks= new int[2][2];
		
		//marks for student1 - row0
		sMarks[0][0] = 70;
		sMarks[0][1] = 80;
		
		//marks for student2 - row2
		sMarks[1][0] = 90;
		sMarks[1][1] = 70;
		
		//Displaying the marks of each student
		//outer for loop for rows
		//inner for loop to read the marks of each student
		
		
		//outer for loop - students(rows)
		//sMarks.length returns the number of rows in a array
		for(int i=0;i<sMarks.length;i++) {
			
			//inner for loop to read the marks of each student
			
			for(int j=0;j<sMarks[i].length;j++) {
				System.out.print(sMarks[i][j] + " ");
			}System.out.println();
			
		}
		

	}

}
