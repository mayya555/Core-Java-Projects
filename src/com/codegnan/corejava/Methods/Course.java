package com.codegnan.corejava.Methods;

public class Course {
	
	int courseId;
	String courseName;
	int duration;
	double courseFee;
	
	
	
	public void getCourseDetails() {
		
		System.out.println("********************************************");
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(duration);
		System.out.println(courseFee);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.courseId= 100;
		course1.courseName="JFS";
		course1.duration=100;
		course1.courseFee=50000.00;
		
		
		/*
		 * Course course2 = new Course(); course2.courseId= 101;
		 * course2.courseName="PFS"; course2.duration=100; course2.courseFee=90000.00;
		 * 
		 * 
		 * Course course3 = new Course(); course3.courseId= 102;
		 * course3.courseName="Data Science"; course3.duration=100;
		 * course3.courseFee=60000.00;
		 */
		
		//to print the details of Course1
		course1.getCourseDetails();
		
		//to print the details of Course2
		/*
		 * course2.getCourseDetails();
		 * 
		 * //to print the details of Course3 course3.getCourseDetails();
		 */
		
		
		
	}

}
