package com.codegnan.collectionsframework;

import java.util.Stack;
 
public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Java");
		stack.push("Python");
		stack.push("C++");
		
		System.out.println(stack);
		
		String peekElement = stack.peek();
		System.out.println(peekElement);  //returns the top element
		System.out.println(stack.pop());
		
		System.out.println("After Pop:" + stack);
	}
}
