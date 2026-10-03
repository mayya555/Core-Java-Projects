package com.codegnan.corejava.OOP.abstraction;

class PartTimeEmployee extends Employee {

	
	int hoursWorked;
	int hourlyrate;
	
	public PartTimeEmployee(int employeeId, String employeeName,int hoursWorked,int  hourlyrate) {
		
		super(employeeId,employeeName);
		
		this.hoursWorked=hoursWorked;
		this.hourlyrate=hourlyrate;
	}
	
	public double calculateSalary() {
		
		double salary;
		salary=hoursWorked * hourlyrate;
		return salary;
	}
	
	public void displayEmployeeType() {
		
		System.out.println("Employee Type:+ PartTime");
	}

}
