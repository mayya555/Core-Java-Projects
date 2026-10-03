package com.codegnan.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableDemo {

	public static void main(String[] args) {
		
		ArrayList <String>  countriesList = new ArrayList<>();
		
		countriesList.add("India");
		countriesList.add("Singapore");
		countriesList.add("Srilanka");
		countriesList.add("Australia");
		
		System.out.println("Before Removal:"+countriesList);
		//enhanced for loop
		/*for(String country:countriesList) {
			
			if(country.equals("Singapore")) {
				countriesList.remove(country);
			}
			System.out.println(country);
		}*/
		
		Iterator<String> iterator = countriesList.iterator();
		
		while(iterator.hasNext()) {
			String country = iterator.next();
			if(country.equals("Singapore")) {
				iterator.remove();
			}
		}
		
		System.out.println("After Removal:"+countriesList);
		//Iterator<String> iterator = countriesList.iterator();
	}
}
