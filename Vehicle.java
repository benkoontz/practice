
// This class was created to represent inheritance
// It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
// use polymorhpism when you want the fields and methods to take on different forms

public class Vehicle {
	
	public String carType = "lambo";
	
	public void carReport() {
		System.out.println("the history for this car is good");
	}
	
	public int carYear(int year) {
		
		year ++;
		
		return year;
	}
	
	

}
