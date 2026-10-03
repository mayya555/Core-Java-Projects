package com.codegnan.corejava.iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterDemo {

	public static void main(String[] args) {
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
			
			writer.write("Hello codegnan!!");
			
			writer.newLine();
			
			writer.write("Buffered writer is faster ");
		}
	}

}
