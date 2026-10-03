package com.codegnan;


public class Student05Demo {

	String name;
	int rollnumber;
	int marks;
	
	
	public void studentdetails(String name,int rollnumber,int marks) {
		
		this.name = name;
		this.rollnumber = rollnumber;
		this.marks = marks;
	}
	
	public void setmarks(int grade ) {
		
		this.marks = grade;
	}
	
	
	public char calculateGrade() {
		
		if(this.marks >= 90 && this.marks <= 100) {
			return 'A';
		}
		
		else if(this.marks >=75 && this.marks <=89) {
			return 'B';
		}
		
		else if(this.marks >=60 && this.marks <=74) {
			return 'C';
		}
		
		else if(this.marks >40 && this.marks <=60) {
			return 'D';
		}
		
		
		else {
			return 'E';
		}
	}
}

//90-100 -A
// 75 - 89 - B
//60 - 74 - c
//40 - 59 - D
//below 40 - E
