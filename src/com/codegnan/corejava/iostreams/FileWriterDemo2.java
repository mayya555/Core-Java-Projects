package com.codegnan.corejava.iostreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	public static void main(String[] args) {
		
		
		try {

            // Create a File object
            File file = new File("feedback.txt");

            // Create the file
            file.createNewFile();

            // Write data into the file
            FileWriter writer = new FileWriter(file);

            writer.write("Student05Demo Name: Sai\n");
            writer.write("Course: Java\n");
            writer.write("Feedback: The course is very useful.");

            // Close FileWriter
            writer.close();

            // Read data from the file
            FileReader reader = new FileReader(file);

            int ch;

            // Read character by character
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            // Close FileReader
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
