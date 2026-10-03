//using break with prime Number//
package com.codegnan;

/*import java.util.Scanner;*/

public class JumpStmt {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the number");
		 * int n=sc.nextInt(); boolean a = false; for(int i=2;i<=n;i++) { if(n%i==0) {
		 * a=true; break; } } if(a) { System.out.println("Not Prime"); } else {
		 * System.out.println("it is Not Prime"); }
		 */
		
		for(int i=1;i<=100;i++) {
			if(i%2!=0) 
				continue;
			System.out.println(i+" ");

		}
	
	}

}
