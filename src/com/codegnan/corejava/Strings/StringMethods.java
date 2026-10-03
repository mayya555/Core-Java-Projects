package com.codegnan.corejava.Strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1 = "Hello Java";
		String s2 = "hello java";
		
		//length()
		//length method gives number of characters in a String
		System.out.println(s1.length());

		//charAt(index)
		System.out.println(s1.charAt(9));
		
		//equals()
		System.out.println(s1.equals(s2));
		
		//equalsIgnoreCase()
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//toUpperCase()
		System.out.println(s1.toUpperCase());
		
		//toLowerCase()
		System.out.println(s1.toLowerCase());
		
		
		//contains
		//checks whether the given character sequence exists in the String
		
		System.out.println(s1.contains("Ja"));
		
		//StartsWith()
		System.out.println(s1.startsWith("Hello"));
		
		//endsWith()
		System.out.println(s1.endsWith("World"));
		
		
		//indexOf()
		//returns the index of th first occurence
		System.out.println(s1.indexOf('a'));
		
		//replace()
		s1.replace("Java","Python");
		System.out.println(s1);
		
		//trim()
		String s = "Work";
		System.out.println(s);
		System.out.println(s.trim());
		
		//isEmpty()
		//It return true if if String is empty
		//i.e if the length of a String is zero
		
		String emptyString="";
		System.out.println(emptyString.length());
		
		System.out.println();
		
		//System
		
		
	}
	

}
