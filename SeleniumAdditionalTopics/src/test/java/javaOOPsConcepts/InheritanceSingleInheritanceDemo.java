package javaOOPsConcepts;

/**
 * Single Inheritance bedeutet, die Child class erbt von der Parent class
 * Die Parent class hat genau eine Child class.
 * 
 * Benz ==> Car: Benz erbt alles von Car
 */
public class InheritanceSingleInheritanceDemo {

	public static void main(String[] args) {
		
		Car car1 = new Car(800000, "Red", "Swift VDI");
		car1.startCar();
		// auf private Methoden kann kann nicht von Außen zugegriffen werden
//		car1.stopCar();
		
		System.out.println("------------------------------------");
		
		Benz benz1 = new Benz(3000000, "Black", "Benz A Class", "white");
		benz1.startCar();
		// auf private Methoden kann kann nicht von Außen zugegriffen werden
//		benz1.stopCar();
		benz1.autoGearModeOn();
	}
}

class Car {
	
	int cost;
	// auf private Variable kann die Child class nicht zugreifen
	private String color;
	String model;
		
	public Car(int cost, String color, String model) {

		this.cost = cost;
		this.color = color;
		this.model = model;
	}

	public void startCar() {
		System.out.println(model + " is started.");
	}
	
	private void stopCar () {
		System.out.println(model + " is stopped.");		
	}
}

class Benz extends Car {
	
	private String openTopWindowColor;

	public Benz(int cost, String color, String model, String openTopWindowColor) {
		super(cost, color, model);
		this.openTopWindowColor = openTopWindowColor;
	}

	public Benz(int cost, String color, String model) {
		super(cost, color, model);
	}
	
	public void autoGearModeOn() {
		System.out.println("Auto gear mode is on.");
	}
}