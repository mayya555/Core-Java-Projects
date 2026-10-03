package com.codegnan.corejava.OOP.inheritance;

public class Employee {
	
	int id;
	String name;
	String companyname;
	double salary;
	
	 
	public Employee(int id,String name,String companyname,double salary) {
		
		this.id = id;
		this.name = name;
		this.companyname = companyname;
		this.salary = salary;
	}
	
	 
	/*public Demo(int i,String n,String c,double s) {
		
		id = i;
		name = n;
		companyname = c;
		salary = s;*/
	
	
	public void getEmployeeDetails() {
		
		System.out.println("Demo Details:");
	}
	
	public void calcEmpsal() {
		
		System.out.println("Demo salary.......");
	}

	public static void main(String[] args) {
		
		Employee e = new Employee(100,"Rani","codegnan",20000.00);
		e.getEmployeeDetails();
		e.calcEmpsal();
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.companyname);
		System.out.println(e.salary);
		
		
		CodegnanEmployee e1 = new CodegnanEmployee();
		
		e1.id=101;
		e1.name= "Arjun";
		e1.companyname="wipro";
		e1.salary=34000.00;
		// child class field
		e1.location="hyderabad";
		e1.displayDetails();
		
		
		System.out.println();
		CodegnanEmployee ce = new CodegnanEmployee();
		

	}
	
	
	

}
