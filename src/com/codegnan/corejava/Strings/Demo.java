package com.codegnan.corejava.Strings;

public class Demo {

	public static void main(String[] args) {
		
		//classname objref = new classname();
		
		//String creation using new keyword
	     //String myString = new String("Hello");
	    
	    //literal
	    //String companyname = "codegnan is a training institute";//--> string constant pool(scp)
	    String movie1 = "Spiderman";
	    String movie2 = "Spiderman";		
	    String movie3 = "Avengers";
	    
	    System.out.println("String created with literal");
	    System.out.println("****************************");
	    
	  //System.out.println(movie1 == movie3);//false
	    
	    System.out.println("2 spiderman compared with == operator");//true
	    System.out.println(movie1 == movie2);
	    System.out.println("2 spiderman compared with equals method");//true
	    System.out.println(movie1.equals(movie2));
	    
	    
	    System.out.println();
	    System.out.println("String with new keyword");
	    System.out.println("***********************");
	    
	    String movie4 = new String("Ice age");
	    String movie5 = new String("Ice age");
	    String movie6 = new String("Interstellar");
	    
	    System.out.println("2 ice age objects compared with == operator");
	    System.out.println(movie4 == movie5 );//false
	    System.out.println("2 ice age objects compared with equals method");
	    System.out.println(movie4.equals(movie5));
	}

}
