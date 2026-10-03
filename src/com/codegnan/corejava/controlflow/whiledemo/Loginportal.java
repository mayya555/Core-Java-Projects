package com.codegnan.corejava.controlflow.whiledemo;

import java.util.Scanner;

public class Loginportal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================================");
		System.out.println("   Welcome to Codegnan Placement Portal");
		System.out.println("=====================================");
		
		String correctpassword = "Ammulu@M";
		
		while(true) {
			
			System.out.println("Enter the password:");
			String password  = sc.nextLine();
			
			if(password==correctpassword) {
				System.out.println("Login sucessful bayya");
				break;
			}
			
			else {
				System.out.println("Ayyo bayya incorrect password, please try again");
			}
		}
		
		sc.close();
		
		

	}

}
