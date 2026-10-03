package com.codegnan.corejava.OOP.abstraction;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//abstract class reference
		 Employee emp1 = new FullTimeEmployee(555,"Ammulu",30000.00);
		 Employee emp2 = new PartTimeEmployee(556,"junnu", 220 , 420);
		 
		 //FullTimeEmployee
		 emp1.displayEmployeedetails();
		 
		 System.out.println("Employee Type:+ FullTime");
		 System.out.println("Salary:" + emp1.calculateSalary());
		 System.out.println();
		 
		 //ParttimeEmployee
		 emp2.displayEmployeedetails();
		 
		 System.out.println("Employee Type:+ PartTime");
		 System.out.println("Salary:"+ emp2.calculateSalary());
		 

	}

}
