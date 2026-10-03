package com.codegnan.collectionsframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> namesList = new ArrayList<>();
		
		namesList.add("Kumar");
		namesList.add("Raj");
		namesList.add("John");
		namesList.add("Shaik");
		namesList.add("Ram");
		
		ListIterator<String> lIter = namesList.listIterator();
		System.out.println("Forward direction:");
		while(lIter.hasNext()) {
			System.out.println(lIter.next());
		}
		
		System.out.println("Backward direction:");
		while(lIter.hasPrevious()) {
			System.out.println(lIter.previous());
		}
	}
}
