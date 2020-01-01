

import java.util.Random;

public class apples extends fruit{
	
	// This method is used to calculate a salary 
	public  void salary() {
		System.out.println("your yearly salary is $52,000");
	}
	
	// This method is used to calculate a car payment
	public void carPayment() {
		System.out.println("your car payment is $5000");
	}
	
	// This method is used to calcualte a house payment
	public  void housePayment() {
		System.out.println("your house payment is $1,000,000");
	}
	
	// This method calculates a calculates a random score for two values
	public static int Score1(int max, int min) {
	
	Random rn = new Random();

	int randomNum = rn.nextInt((max - min) + 1) + min;
	
	return randomNum;

}
	// This method calculates a calculates a random score for two values
	public static int Score2(int max, int min) {
		
		Random rn = new Random();

		int randomNum = rn.nextInt((max - min) + 1) + min;
		
		return randomNum;
	}
}
