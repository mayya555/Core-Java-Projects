package com.codegnan.corejava.OOP.abstraction;


	class FullTimeEmployee extends Employee {
		
		double monthSalary;
		
		
		//Constructor
		public FullTimeEmployee(int employeeId,String employeeName,double monthSalary) {
			
			super(employeeId, employeeName);
			this.monthSalary = monthSalary;
		}
		
		//Override 
		public double calculateSalary() {
			
			return monthSalary;
		}
		
		public void displayEmployeeType() {
			
			System.out.println("Employee Type:+ FullTime");
		}
		
	}


