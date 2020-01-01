

import java.util.Random;

public class apples extends fruit{
	
	// This method is used to calculate a net income
	public  int netIncome(int salary) {
		
		// subtract 1000 each week for expenses
		for(int i = 0; i < 52; i++) {
			salary -= 1000;
		}  //the salary is no 52000 less original amount: 80000 - 52000 = 280000
		
		// calculate a random salary between 56000 and 280000
		salary = Score1(salary*2, salary);
		
		return salary;
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
