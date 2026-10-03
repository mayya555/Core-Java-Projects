package java8features.functionalfaces;

import java.util.function.Consumer;

//consumer takes a value,
//uses that value for processing
//but does not return anything.

//It has an abstract method accept()

//void accept(T t)

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> consumer = name -> System.out.println("Welcome"+name);
	}
}
