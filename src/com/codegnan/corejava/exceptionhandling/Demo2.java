package com.codegnan.corejava.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		
		File file = new File("D:/notes.txt");
		
		try {
			file.createNewFile();
		}
		catch (IOException e) {
			System.out.println("File cannot be created due to an input or output problem");
			e.printStackTrace();
		}

	}

}
