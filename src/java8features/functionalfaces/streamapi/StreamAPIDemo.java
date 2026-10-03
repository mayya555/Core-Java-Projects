package java8features.functionalfaces.streamapi;

import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		
		//Step1: Create a Collection
		List<String> names = List.of("Ravi","John","Priya","Rahul");
		
		//Step2: Create a stream from the collection
		Stream<String> stream = names.stream();
		
		//Step3: Apply intermediate operation
		stream.filter(n->n.startsWith("R"));
		
		//Step4: Apply a terminal operation
		stream.forEach(name->System.out.println(name));
		
		//the above 3 steps can be written in a single statement
		
		names.stream().filter(n->n.startsWith("R"))
		                                      .forEach(name->System.out.println(name));

	}

}
