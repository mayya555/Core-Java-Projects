package com.codegnan.collectionsframework.setsdemo;

import java.util.Objects;

public class Employee {

	int id;
	String name;
	String department;
	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	
	
	//HashSet first calls hashCode() to decide which bucket should be checked.
	//here we consider id for identifying an employee
	//so, employees having same id will produce same hashCode
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		//step1 : are both references pointing to same object
		
		if(this==obj) {
			return true;
		}
		
		
		//step2 : if the other reference is null
		
		if(obj==null) {
			return false;
		}
		
		
		//step3 : Convert object reference into employee reference 
		//so that we can access Employee fields
		Employee other = (Employee) obj;
		
		
		//step3 : compare the field which defines the equality
		return this.id == other.id;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
}