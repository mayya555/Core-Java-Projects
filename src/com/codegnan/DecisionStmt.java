package com.codegnan;

import java.util.Scanner;

public class DecisionStmt {

	public static void main(String[] args) {
		
		/*
		 * if(5<2) { System.out.println("codegnan"); }
		 */
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter the First Number"); int a=sc.nextInt();
		 * System.out.println("enter the second Number"); int b=sc.nextInt();
		 * System.out.println("enter the third number"); int c=sc.nextInt();
		 */
		/*
		 * if((a>b) && (a>c)) {1 System.out.println("a is greatest " + a); } if((b>a) &&
		 * (b>c)) { System.out.println("b is greatest " + b); } if((c>a) && (c>b)) {
		 * System.out.println("c is greatest " + c); }
		 */
		
		/*
		 * if(a>b) { System.out.println("a is greatest " + a); } if(b>a) {
		 * System.out.println("b is greatest " + b); }
		 */
		
		/*
		 * if(10!=20) { System.out.println("hi"); } else { System.out.println("bye"); }
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("eligible  to vote"+ age);
		}
		else {
			System.out.println("not eligible to vote");
		}

	}

}
