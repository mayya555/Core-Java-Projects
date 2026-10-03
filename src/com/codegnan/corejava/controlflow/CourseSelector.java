package com.codegnan.corejava.controlflow;

import java.util.Scanner;

public class CourseSelector {

	public static void main(String[] args) {
		
		System.out.println("=====================");
		System.out.println("        CG Placement Portal");
		System.out.println("======================");
		System.out.println("welcome Candidate!");
		System.out.println("version 1.0");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Can u please enter the course ID(1 - 3):");
		
		int option = sc.nextInt();
		
		//switch decision making
		switch(option) {
		
		case 1:
			System.out.println("Python selected");
		break;
		
		case 2:
			System.out.println("Java selected");
		break;
		
		case 3:
			System.out.println("Data science selected");
		break;
		
		default:
			System.out.println("Invalid option");
		}

	}

}
