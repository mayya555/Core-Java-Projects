package com.codegnan.corejava.Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sbuilder = new StringBuilder("Sachin");
		
		System.out.println(sbuilder);
		
		sbuilder.append("Tendulkar");
		
		System.out.println(sbuilder);
		System.out.println();
		
		//stringbuffer
		System.out.println("With StringBuffer");
		
		StringBuffer sbuffer = new StringBuffer("Virat");
		
		System.out.println(sbuffer);
		
		sbuffer.append("Kohli");
		System.out.println(sbuffer);
		
		

	}

}
