package com.codegnan.corejava.iostreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		File file = new File("myfile.txt");
		
		//FileWriter write  = null;
		try(FileWriter writer = new FileWriter(file)) {
			
			
			//FileWriter writer = new FileWriter(file);
			
			writer.write("India is my country");
			writer.write("\n I love my country");
			
			char[] charArray = {'a','e','i','o','u'};
			writer.write("\n");
			writer.write(charArray);
			
			writer.flush();
			;
		}
		
		catch (IOException e) {
			
			System.out.println("Please make sure the file exists");
			e.printStackTrace();
		}
		/*
		 * finally { writer.close(); }
		 */
		

	}

}
