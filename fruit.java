
// Create an abstract class. Create an abstract class when you want to create a base for another class.
public abstract class fruit extends Animal {
	
	// abstract method, these must be overwritten in another class
	public abstract int netIncome(int salary); 
	public abstract void carPayment();
	public abstract void housePayment();
	
	// attributes initialized by a constructor in the apples class
	public int salary;
	public int carPrice;
	public int housePrice;
	String name;

}
