package com.codegnan.corejava.iostreams;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) {
		
		try {
			File dir = new File("mynotes");

            //create a directory
			dir.mkdir();
			
			//File(File  file,"name of theFile")
			
			File file1 = new File(dir,"arrays.txt");
			file1.createNewFile();
			
			File file2 = new File(dir,"exceptions.txt");
			file2.createNewFile();
			
			File file3 = new File(dir,"controlflow.txt");
			file3.createNewFile();
			
			dir.list();
		}
		
		catch(IOException e ) {
			e.printStackTrace();
		}
	}
		

}
