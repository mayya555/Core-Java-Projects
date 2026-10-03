package com.codegnan.corejava.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		
		try(BufferedReader reader 
				= new BufferedReader(new FileReader("output.txt"))) {
			
			System.out.println("Read the file line by line");
			
			while((line = reader.readLine())! = null) {
				
				System.out.println(line);
			}catch(IOException e ) {
				e.printStackTrace();
			}
		}
	}
}
