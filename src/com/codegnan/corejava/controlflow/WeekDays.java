package com.codegnan.corejava.controlflow;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		
		System.out.println("=====================");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Can u please enter the Day(1 - 7):");
		
		int  day = sc.nextInt();
		
		//switch decision making
		switch(day) {
		
		case 1 :
			System.out.println("Sunday is the first day of week");
		break;
		
		case 2 :
			System.out.println("Monday is the second day of week");
		break;
		
		case 3 :
			System.out.println("Tuesday is the third day of week");
		break;
		
		case 4 :
			System.out.println("wednesday is the fourth day of week");
		break;
		
		case 5 :
		    System.out.println("Thursday is the fifth day of week");
	    break;
	    
		case 6 :
			System.out.println("friday is the sixth day of week");
		break;
		
		case 7 :
			System.out.println("Saturday is the Last day of week");
		
		default:
			System.out.println("Invalid day");
		}

	}

}
