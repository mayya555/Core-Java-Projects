package com.codegnan.corejava.iostreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		
		Employee emp = new Employee(100,"Raj");
		
		//FileOutputStream - create or open the file
		try(FileOutputStream fos = new FileOutputStream("employee.ser") {
			ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				
				//writeObject() serializes the Employee object
				//and writes the data into the file
				oos.writeObject(emp);
				
				System.out.println("Object Serialized Successfully");
			}
			
			catch (IOException e ) {
				e.printStackTrace();
			}
		}
	}

}
