
import java.util.Scanner;

// inherit the fields and methods from the apples class
public class fish extends apples {


	public static void main(String[] args) {
		
		// calling two score methods using static, the first name is always 50 and the second is a number between 50 and 0
		System.out.println("the score of the halo game was " + Score1(50,50) + " to " + Score2(50,0));
		
		// create an apples object to use
		apples obj = new apples();
		
		// call the carPayment method
		obj.carPayment(); 
		
		System.out.println("your salary is " + obj.netIncome(obj.salary));
		
		// encapsulation
		apples nameObj = new apples();
		nameObj.setName("ben");
		System.out.println("Name: " + nameObj.getName());
		
	    // polymorphism
		apples animalObj = new apples();
	    animalObj.animalSound();
		}
	


	}


