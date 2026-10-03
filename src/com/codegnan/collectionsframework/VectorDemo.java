package com.codegnan.collectionsframework;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		String s = "Cricket";
		
		Integer myInt = new Integer(20);
		
		Integer mInt = 444;
		
		Vector<Integer> vectorList = new Vector<>();
		
		vectorList.add(100);
		vectorList.add(200);
		vectorList.add(300);
		
		Enumeration<Integer> e = vectorList.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}