
public class TollBooth {

	//Instance variables of the class TollBooth.
	private int numberOfTrucksPassed;
	private double tollAmount;

	
	//Get and set methods for the above variables.
	
	public int getNumberOfTrucksPassed() {
		return this.numberOfTrucksPassed;
	}
	
	public double getTollAmount() {
		return this.tollAmount;
	}
	
	
	
	//Methods of the class TollBooth.
	
	public double calculateToll(int xl, double wgt) {
		
		// $5/axle + $10/half-ton(1000 pounds)
		
		double result;
		numberOfTrucksPassed ++;
		result = (5 * xl) + (10 * (wgt/1000));
		tollAmount = tollAmount + result;
		return result;
		
		
		
		
	}
	
	public void displayTotal() {
		System.out.println("The total amount of tolls collected so far: $" + getTollAmount());
	}
	
	public void resetTollBooth() {
		numberOfTrucksPassed = 0;
		tollAmount = 0;
	}
	
	
	//Constructors
	
	public TollBooth() {
		
	}
	
	
	







}
