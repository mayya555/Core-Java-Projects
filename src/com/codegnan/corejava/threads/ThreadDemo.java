package com.codegnan.corejava.threads;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread currrentThread = Thread.currentThread();
		System.out.println(currrentThread);
		System.out.println(currrentThread.getName());

	}

}
