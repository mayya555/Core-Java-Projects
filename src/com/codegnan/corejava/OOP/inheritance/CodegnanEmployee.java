
package com.codegnan.corejava.OOP.inheritance;

public class CodegnanEmployee extends Employee {
	
	String location;
	
	public CodegnanEmployee() {
		
	}
	
	public CodegnanEmployee(int id , String name , String companyname , double salary, String location ) {
		
		super(id,name,companyname , salary);
		this.location = location;
	}
	
	public static void main(String[] args) {
		
		System.out.println(id+"|"+name+"|"+companyname+"|"+salary+"|"+location);

	}

	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}

}
