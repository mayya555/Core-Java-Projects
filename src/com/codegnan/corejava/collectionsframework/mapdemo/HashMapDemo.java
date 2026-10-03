package com.codegnan.corejava.collectionsframework.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Citizen> citizens = new HashMap<>();
		
		Citizen cz = new Citizen("Raj",33,"Hyderabad");

		citizens.put("10001",new Citizen("Ravi",30,"Hyderabad"));
		citizens.put("10002",cz);
		citizens.put("10003",new Citizen("Priya",30,"Bangalore"));
		citizens.put("10004",new Citizen("Ram",30,"Lucknow"));
		citizens.put("10005",new Citizen("John",30,"Goa"));

		//retrieve only the keys using keySet()
		
		System.out.println("***Retrieving Keys using KeySet()***");
		
		for(String aadharId:citizens.keySet()) {
			System.out.println(aadharId);
		}
		
		System.out.println("***Retrieving the key and Value Pairs***");
		//Retrieving the citizen objects associated with each key
		for(String aadharId:citizens.keySet()) {
			Citizen citizen = citizens.get(aadharId);
			        System.out.println(aadharId + " -> " + citizen);
		}
		
		//retrieve the values from hashset
		//using values()
		
		System.out.println();
		System.out.println("***Retrieve Values only using values()***");
		for(Citizen citizen:citizens.values()) {
			System.out.println(citizen);
		}
		
		//entrySet -> AadharId + Citizen
		//entrySet() is used when we need both key and Value pairs
		System.out.println("*****Retrieving Key Value Pairs using entrySet()");
		
		for(Map.Entry<String,Citizen>entry:citizens.entrySet()) {
			System.out.println("Aadhar Id:"+entry.);
		}
	}

}
