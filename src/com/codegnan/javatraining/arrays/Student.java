package com.codegnan.javatraining.arrays;


import java.util.Scanner;

public class Student {
	
	String Name;
	int Id;
	int Age;
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		
		student.Name = "Rahul";
		student.Id = 225;
		student.Age = 22;
		
		
		Student student2 = new Student();
		
		
		student2.Name = "Ammulu";
		student2.Id = 223;
		student2.Age = 24;
		
		Student[] studentArray = new Student[2];
		
		studentArray[0] = student;
		studentArray[1] = student2;
		 
	    for(Student s: studentArray) {
	    	
	    	System.out.println("details of "+ s.Name);
	    	System.out.println(".............");
	    	System.out.println("Name:"+ s.Name);
	    	System.out.println("Id:"+ s.Id);
	    	System.out.println("Age:"+ s.Age);
	    }
		
		
		
	}

}
