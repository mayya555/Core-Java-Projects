package java8features.functionalfaces;

import java.util.function.Consumer;

public class Demo {
	
	public static void printMessage(String str) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		
		//creating a consumer
		//It accepts an argument but returns nothing
		
		//Consumer<String> c = str -> System.out.println("My Institute:"+str);
		Consumer<String> c = s -> Demo.printMessage(s);
		c.accept("Codegnan");
		
	}
}
