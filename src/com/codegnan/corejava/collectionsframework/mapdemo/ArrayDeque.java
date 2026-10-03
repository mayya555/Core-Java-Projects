package com.codegnan.corejava.collectionsframework.mapdemo;

import java.util.Deque;

public class ArrayDeque {

	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<>();
		
		//add elements
		deque.add("Java");
		deque.add("python");
		
		
		System.out.println("C");
		
		//accessing elements
		
		System.out.println("getFirst() :"+deque.getFirst());
		System.out.println("getLast() :"+deque.getLast());
		
		//using ArrayDeque as STACK - LIFO
		deque.clear();
		System.out.println("Deque after clearing "+deque);
		
		deque.push("Java");
		deque.push("Python");
		deque.push("C++");
		
		System.out.println(deque);
		
		//pop() removes the last inserted element
		deque.pop();
		
		System.out.println("ArrayDeque after pop() operation:"+deque);
		
	}

}
