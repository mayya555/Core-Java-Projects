package com.codegnan.corejava.controlflow;

import java.util.Scanner;

public class Placementportal {

	public static void main(String[] args) {
		System.out.println("=====================");
		System.out.println("        CG Placement Portal");
		System.out.println("======================");
		System.out.println("welcome Candidate!");
		System.out.println("version 1.0");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter student ID:");
		
		int id = sc.nextInt();
				// condition to check whether the id is 100
		
		if(id==100) {
			System.out.println("login Sucessful");
		}
		
		else {
			System.out.println("Invalid student login");
		}
		
		//Read the student percentage and check the eligibility 
		System.out.println("Enter percentage");
		
		double percentage = sc.nextDouble();
		
		if(percentage >=90) {
			System.out.println("He or She eligible for premium companies");
		}
		
		else if(percentage>=60) {
			System.out.println("Eligible for regular companies");
		}
	   else if(percentage>=50) {
			System.out.println("Training required");
		}
		
	   else {
		   System.out.println("not eligible");
	   }
		
		sc.close();

	}
	

}
