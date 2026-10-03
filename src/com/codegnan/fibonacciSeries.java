//FIBONACCI SERIES IS A SEQUENCE OF NUMS WHERE EACH NUM IS THE SUM OF PREVIOUS TWO NUMBVERS\

package com.codegnan;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++) {
			System.out.println(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}

	}

}
