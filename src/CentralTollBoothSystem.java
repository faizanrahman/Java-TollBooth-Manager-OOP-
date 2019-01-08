
public class CentralTollBoothSystem {

	public static void main(String[] args) {
		
		
		Truck honda = new Truck(2, 2000, "Honda");
		
		System.out.println(honda.getMake());
		
		Truck toyota = new Truck(3, 3000, "Toyota");
		
		System.out.println(toyota.getMake());
		
		Truck ford = new Truck(4, 4000, "Ford");
		
		System.out.println(ford.getMake());
		
		Truck freightliner = new Truck(5, 5000, "Freightliner");
		
		System.out.println(freightliner.getMake());
		
		Truck temsa = new Truck(8, 6000, "TEMSA");
		
		System.out.println(temsa.getMake());
		
		
		// Create two TollBooth Objects
		
		TollBooth illinoisTollway = new TollBooth();
		
		System.out.println(illinoisTollway.calculateToll(honda.getAxles(), honda.getWeight()));
		
		System.out.println(illinoisTollway.calculateToll(temsa.getAxles(), temsa.getWeight()));
		
		System.out.println(illinoisTollway.calculateToll(toyota.getAxles(), toyota.getWeight()));
		
		System.out.println(illinoisTollway.calculateToll(ford.getAxles(), ford.getWeight()));
		
		System.out.println(illinoisTollway.calculateToll(freightliner.getAxles(), freightliner.getWeight()));
		
		System.out.println(illinoisTollway.getNumberOfTrucksPassed());
		
		System.out.println(illinoisTollway.getTollAmount());
		
		
		illinoisTollway.displayTotal();
		
		illinoisTollway.resetTollBooth();
		
        // Both variables are set back to zero after resetMeter method is called.
		
		System.out.println("The toll amount has been reset back to " + illinoisTollway.getTollAmount());
        System.out.println("The number of trucks passed have been reset back to " + illinoisTollway.getNumberOfTrucksPassed());
        
       //(How to write to methods in the same print statement)System.out.println(illinoisTollway.getTollAmount(), illinoisTollway.getNumberOfTrucksPassed());
	}

}
