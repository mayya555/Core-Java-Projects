package java8features.functionalfaces.streamapi;

import java.util.List;

public class IntermediateOperationsDemo {

	public static void main(String[] args) {
		
		//List containing strings
		List<String> names = List.of("Ravi","John","Priya","Rahul");
		//map
		names.stream().map(name->name.toUpperCase()).forEach(System.out::println);
		
		//sorted
		names.stream().sorted().forEach(System.out::println);
		
		System.out.println("***distinct****");
		List<Integer>numbers = List.of(10,20,30,40,50);
		numbers.stream().distinct().forEach(System.out::println);
		
		

	}

}
