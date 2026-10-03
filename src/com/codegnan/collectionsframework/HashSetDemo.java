package com.codegnan.collectionsframework;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Hyderabad");
		hs.add("Vijayawada");
		hs.add("Warangal");
		hs.add("Vizag");
		
		System.out.println(hs);
	}
}
