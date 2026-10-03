package com.codegnan.corejava.controlflow;

import java.util.Scanner;

public class LoginUsing2DArray {

	public static void main(String[] args) {
		
		//store 4 users data in an array each row represent a username and password
		String [][] users = 
			   {{"admin", "admin123"},
				{"john","john123"},
				{"rahul","rahul123"},
				{"shaik","shaik123"}};
		
		Scanner sc = new Scanner(System.in);
		
		boolean success = false;
		//take input from console 
		System.out.println("Please Enter the username");
		String x = sc.nextLine();
		
		System.out.println("Please Enter the password");
		String y = sc.nextLine();
		
		//search every user
		
		for(int i=0;i<users.length;i++) {
			if(x.equals(users[i][0])  && y.equals(users[i][1])) {
				success = true;
				break;
			}
		}
		
		if(success) {
			System.out.println("Login Sucessful");
		}
		else {
			System.out.println("Invalid username and password");
		}
		
		sc.close();
		
		
		}

	}


