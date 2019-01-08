
public class Truck {
 
	// Instance variables of the class Truck.
	private int axles;
	private double weight;
	private String make;
	
	
	// Set methods
	public void setAxles(int noOfAxle) {
		noOfAxle = this.axles;
	}
	
	public void setWeight(double wgt) {
		wgt = this.weight;
	}
	
	public void setMake(String make) {
		make = this.make;
	}
	
	// Get methods
	
	public int getAxles() {
		return axles;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String getMake() {
		return this.make;
	}
	
	//Constructors
	
	public Truck() {
		
	}
	
	public Truck(int numaxles, double lbsweight, String namemake) {
	//	axles = this.axles;
	//	weight = this.weight;
	//	make = this.make;
		
		axles = numaxles;
		weight = lbsweight;
		make = namemake;
	} 
	
	
	
}
