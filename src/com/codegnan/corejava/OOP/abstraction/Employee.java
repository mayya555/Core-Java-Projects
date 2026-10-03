package com.codegnan.corejava.OOP.abstraction;

 abstract class Employee {
		
		int employeeId;
		String employeeName;
		
		   // Parameterized constructor
		public Employee(int employeeId,String employeeName) {
			
			this.employeeId = employeeId;
			this.employeeName = employeeName;
		}
	
		// Concrete method
	public void displayEmployeedetails() {
		
		System.out.println("EmployeeId:"+employeeId);
		System.out.println("EmployeeName:"+employeeName);
	}
	
	
	 // Abstract method
	public abstract double calculateSalary();
}
