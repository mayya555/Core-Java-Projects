package com.codegnan.corejava.controlflow;

import java.util.Scanner;

public class OfficeSchedule {

	public static void main(String[] args) {
		//ctrl+shift+o can be used to import class package
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the current task number(1 - 5)");
		
		int a = sc.nextInt();
		
		// display the schedule of the user as per the input
		System.out.println("\n Remaining tasks");
		
		switch(a) {
		
		case 1 :
			System.out.println("Login");
			
		case 2 :
			System.out.println("Check Emails");
			
		case 3 :
			System.out.println("Attend meetings");
		
		case 4 :
			System.out.println("Complete coding");
		
		case 5 :
			System.out.println("Logout");
			
		default :
			System.out.println("Invalid task number");
		}
		
		
		sc.close();
	}

}
