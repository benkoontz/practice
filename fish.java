


import java.util.Scanner;
import java.io.*;


// inherit the fields and methods from the apples class
public class fish extends apples {

	int b = 1; // default is accessible in same package, same package subclass, and same package non-subclass
	public int a = 2; // public is accessible in same class, same package subclass, same package non subclass, different package subclass, and different package non subclass
	protected int c = 3; // protected is accessible in the same class, same package subclass, same package non subclass, and different package subclass
	private int d = 4; // private is only accessible in the same class
	

	public static void main(String[] args) {
		
		// calling two score methods using static, the first score is always 50 and the second score is a number between 50 and 0
		// since I'm using the static keyword in the apples class, I don't have to create an object to call the method
		System.out.println("the score of the halo game was " + Score1(50,50) + " to " + Score2(50,0));
		
		// create an apples object to use, so since the method isn't static in apples, I have to create an object
		apples obj = new apples();
		
		// call the carPayment method
		obj.carPayment(); 
		
		System.out.println("your salary is " + obj.netIncome(obj.salary));
		
		// encapsulation, the reason why you would use encapsulation is so that you can hide sensitve data from users
		apples nameObj = new apples();
		nameObj.setName("ben");
		System.out.println("Name: " + nameObj.getName());
		
	    // polymorphism, the reason why you would use polymorphism is for code reusability
		apples animalObj = new apples();
	    animalObj.animalSound(); // in the animal class the method outputs 'Animal Sound', however in the apples class I changed the metho to print "animal sound
	    // has changed due to polymorphism"
	    
	    // inheritance, the reason why you would use inheritence is for code reusability, I'm inheriting the field carType and the method Car year from the class Vehicle
		Vehicle car = new Vehicle();
		car.carReport();
		System.out.println("The type of car is a " + car.carType + " and the car year is " + car.carYear(2010));
		
		// String buffer example. The string buffer class lets you modify strings and perform different functions on strings.
		// The String buffer class has a lot of different functions that you can use on strings
		StringBuffer s = new StringBuffer("hello "); // by default the capacity is 16
		int x = s.capacity();
		System.out.println("The capacity of the string is " + x); // 16 + 6 = 22
		s.append(" ben");
		System.out.println("appending ben the string: " + s);
		
		// inherit from apples
		test.append(" *thumbs up* you've been inherited");
		System.out.println(test);
		
		
		
	
	
	
	
	
	
	}
	

	   
	   
	


	}


