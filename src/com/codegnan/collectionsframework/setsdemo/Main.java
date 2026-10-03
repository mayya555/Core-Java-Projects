package com.codegnan.collectionsframework.setsdemo;

import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		
		LinkedHashSet<Employee> employees = new LinkedHashSet<>();
		
		Employee e1 = new Employee(101,"Ravi","Development");
		Employee e2 = new Employee(102,"Priya","Testing");
		Employee e3 = new Employee(103,"Rahul","HR");
		
		
		//Adding the employee with same id as e1
		Employee e4 = new Employee(101,"Ravi Kumar","Support");
		System.out.println(employees.add(e1));
		System.out.println(employees.add(e2));
		System.out.println(employees.add(e3));
		System.out.println(employees.add(e4));
		
		System.out.println("\nEmployees in HashSet:");
		
		for(Employee em:employees) {
			System.out.println(em);
		}
		
		
		
	}
}
