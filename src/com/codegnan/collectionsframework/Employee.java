package com.codegnan.collectionsframework;

public class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	
	public Employee(int id, String name) {
		
		this.id = id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	//Sort  by Id
		@Override
		public int compareTo(Employee emp) {
			
			return Integer.compare(this.id, emp.id);
		}
		
		//Sort by name
	    public int compareTo(Employee emp) {
			
			return this.name.compareTo(emp.name);
		}
		
		
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}