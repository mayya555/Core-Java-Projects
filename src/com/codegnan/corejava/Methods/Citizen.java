package com.codegnan.corejava.Methods;

public class Citizen {

	String name;
	int age;
	String gender;
	int aadharId;
	
	public void getCitizenDetails() {
		
		System.out.println("Citizen detials:");
		
		System.out.println("_______________________________");
		System.out.println("CourseName:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("AadharId:"+aadharId);
		
	}
	
	
	
	public static void  main(String[] args) {
		
		Citizen cz1 = new Citizen();
		cz1.name="arjun";
		cz1.age=25;
		cz1.gender="male";
		cz1.aadharId=72319089;
		
		Citizen cz2 = new Citizen();
		cz2.name="Ammulu";
		cz2.age=19;
		cz2.gender="female";
		cz2.aadharId=45678909;
		
		//to print the citizen details 
		cz1.getCitizenDetails();
		
		// to print the cz2 details
		cz2.getCitizenDetails();

	}
}
