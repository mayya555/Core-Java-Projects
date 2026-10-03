package com.codegnan.corejava.collectionsframework.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>  {
	
	public int compare(Employee e1, Employee e2) {
		
		return Integer.compare(e1.getId(), e2.getId());
	}
}
