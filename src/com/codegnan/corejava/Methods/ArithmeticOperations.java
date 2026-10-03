package com.codegnan.corejava.Methods;


//method demonstrating pass by value
public class ArithmeticOperations {
	
	public void add(int mark1,int mark2,String studentName) {
		
		System.out.println("add method execution:");
		System.out.println("Total marks:"+ studentName+":"+(mark1+mark2));
		System.out.println("add method completed:");
		//return a+b;
	}
	
	//method demonstrating pass by reference
	public void addOperation(Student student) {
		
		int totalMarks = student.mark1+student.mark2;
		System.out.println("TotalMarks for "+student.name +":"+totalMarks);
	}
	

	public static void main(String[] args) {
		
		ArithmeticOperations ao = new ArithmeticOperations();
		
		int mark1=100;
		int mark2=2000;
		String name="Raj";
		
		//pass by value
//		ao.add(mark1, mark2,name);
		
		Student student = new Student(mark1,mark2,name);
		
		//pass by reference
		ao.addOperation(student);
	}

}
