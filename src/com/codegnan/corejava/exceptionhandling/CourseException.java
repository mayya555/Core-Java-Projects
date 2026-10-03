package com.codegnan.corejava.exceptionhandling;

//Custom Exception
class NotEligibleForCourseException extends Exception {
	
	public NotEligibleForCourseException (String message) {
		
		super(message);
	}
}

//Student05Demo class
class Student {
	
	String Name;
	double percentage;
	
	Student(String Name,double percentage) {
		this.Name = Name;
		this.percentage = percentage;
		
	}
	
	void enrollCourse() throws NotEligibleForCourseException {
		
		if(percentage > 60) {
			
			throw new NotEligibleForCourseException("Student05Demo is not Eligible for the course");
		}
		
		else {
			System.out.println("Course Enrollment is successful");
		}
	}
}

//Main class
public class CourseException {

	public static void main(String[] args) {
		
		Student student = new Student("Ravi",52);
		
		System.out.println("Student05Demo"+ student.Name);
		System.out.println("Student05Demo"+ student.percentage);
		
		try {
			student.enrollCourse();
		}
		catch (NotEligibleForCourseException e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
