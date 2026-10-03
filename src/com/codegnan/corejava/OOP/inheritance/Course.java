package com.codegnan.corejava.OOP.inheritance;

public class Course {

	
	int id;
	String coursename;
	
	public Course() {
		
		this(0,null);
	}
	
	
	public Course(int id , String coursename) {
		
		if(coursename.equals(null)) {
			this.coursename = "unknown";
		}
		
		else {
			this.id = id;
			this.coursename = coursename;
		}
	}
	//toString() is a string  representation of an object.
	
	
	@Override
	public String toString() {
		
		return id + " " + coursename;
	}
}
