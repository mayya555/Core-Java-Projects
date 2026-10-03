package com.codegnan.corejava.iostreams;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int id;
	private String Name;
	
	//confidential field
	//transient modifier will restrict 
	public Employee(int id , String Employee) {
		super();
		this.id =id;
		this.Name= Name;

	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public static void main(String[] args) {
		
		
	}

}
