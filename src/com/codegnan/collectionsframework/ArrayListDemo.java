package com.codegnan.collectionsframework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// int[]arr = 
		
		//ArrayList<datatype> myList = new ArrayList<>();     ---> to create arrayList by using this
		
		Employee emp1 = new Employee(101,"RDJ");
		
		ArrayList<Employee> empList = new ArrayList();
		
		empList.add(emp1);
		empList.add(new Employee(102,"Kumar"));
		empList.add(new Employee(103,"Jaya"));
		empList.add(new Employee(103,"John"));
		
		//add the element at the first index
		empList.addFirst(new Employee(100,"Keerthi"));
		
		//add the element at the Last index
		empList.addLast(new Employee(200,"Khan"));
		
		System.out.println("Size of the ArrayList:"+empList.size());
		
		System.out.println(empList.set(1,new Employee(121,"Rajeshwar")));
		
		//empList.clear();		
		
		/*ArrayList<String> fruitsList = new ArrayList<>();
		fruitsList.add("Banana");
		fruitsList.add("Apricot");
		fruitsList.add("Banana");
		fruitsList.add(null);
		fruitsList.add("Apple");
		
		/*for(int i=0;i<fruitsList.size();i++) {
			
			System.out.println(fruitsList.get(i));
		}*/
		
		for(Employee employee:empList) {
			System.out.println(employee);
		}
	}

}
