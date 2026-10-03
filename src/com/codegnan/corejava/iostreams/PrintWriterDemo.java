package com.codegnan.corejava.iostreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		
		try(PrintWriter writer = new PrintWriter(new FileWriter("student.txt"))) {
			
			/*writer.println("Student05Demo Details:");
			writer.println("Name:Ravi");
			writer.println("Age:22");
			writer.println("course: Java");
			writer.printf("Percentage:%2f", 82.2343);*/
			
			//%s represents the String
			//%n represents new line
			writer.printf("Name:%s%n","Ravi"); 
			writer.printf("%10s%n", "Java");   //right aligned String
			writer.printf("%-10s%n","Java");   //leftt aligned String
			
			//%d is to print the integer
			writer.printf("Age%d%n",22);
			
			System.out.println("Data written Successfully");
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
