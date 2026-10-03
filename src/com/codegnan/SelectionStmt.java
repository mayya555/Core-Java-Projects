package com.codegnan;

import java.util.Scanner;

public class SelectionStmt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option");
		char ch=sc.next().charAt(0);
		switch(ch) {
		case('a'):System.out.println("vowel");
		break;
		case('e'):System.out.println("vowel");
		break;
		case('i'):System.out.println("vowel");
		break;
		case('o'):System.out.println("vowel");
		break;
		case('u'):System.out.println("vowel");
		default:System.out.println("it not a vowel");
		}
		/*
		 * int option=sc.nextInt();
		 * 
		 * switch(option) { case 100:System.out.println("Police number"); break; case
		 * 103:System.out.println("enquiry number"); break; case
		 * 108:System.out.println("Emergency number"); break;
		 * default:System.out.println("invalid option"); }
		 */

	}

}
