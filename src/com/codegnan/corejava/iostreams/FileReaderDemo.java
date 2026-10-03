package com.codegnan.corejava.iostreams;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		try(FileReader reader = new FileReader("myfile.txt")) {
			
			System.out.println();
		}

	}

}
