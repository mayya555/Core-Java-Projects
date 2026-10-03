package com.codegnan.corejava.iostreams;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		
		
		try {
			
			File file = new File("jfs.txt");
			
			//to create a physical file use createNewFile()
			file.createNewFile();
			
			//exists() returns boolean true or false , if file exists it rerurns true 
			//if file doesnt exist it returns false
			System.out.println("Does the file exist ? : "+file.exists());
			
			File directory = new File("jfs57directory");
			
			//mkdir() is used to create the directory
			directory.mkdir();
			
		}
		
		catch(IOException e) {
			
			e.printStackTrace();
		}

	}

}
