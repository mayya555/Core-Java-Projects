//write a java program to find out factorial of a given number//
package com.codegnan;

import java.util.Scanner;

public class PracticeLoops {

	public static void main(String[] args) {
		// factorial //
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the Number"); int n=sc.nextInt(); int i=n,fact=1;
		 * do { fact=fact*i; i--; }while(i>=1); System.out.println(fact);
		 */
		//Mujltiplication//
		/*
		 * Scanner sc= new Scanner(System.in); System.out.println("Enter the Number");
		 * int n= sc.nextInt(); int i=1; do { System.out.println(n+" x "+i+" = "+n*i);
		 * i++; } while(i<=10);
		 */ 
		//while loop print 1 to 100 natural numbers//
		/*
		 * int i=1; while(i<100000) { System.out.print(i+ "  "); i++; }
		 */
		//sum of 100 natural numbers//
		/*
		 * Scanner sc = new Scanner(System.in); int i=1,sum=0; while(i<=10) { sum=sum+
		 * i; i++; } System.out.println(sum);
		 */
		
		//using only while loop mutliplication//
		/*
		 * int i=1,n=2; while(i<=10) { System.out.println(n+" x "+i+"="+n*i); i++; }
		 */
		
		//using only while loop factorial//
		/*
		 * System.out.println("enter the number"); Scanner sc = new Scanner(System.in);
		 * int n=sc.nextInt(); int sum=1;
		 * 
		 * while(n>=1) { sum*=n; n--;
		 * 
		 * } System.out.println(sum);
		 */
		//using for loop for infinite 1//
		/*
		 * for(int i=1;i<=10;i++) { System.out.println(i+" "); i--; }
		 */
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				System.out.println("it is even number"+i);
			}
		}

	}

}
