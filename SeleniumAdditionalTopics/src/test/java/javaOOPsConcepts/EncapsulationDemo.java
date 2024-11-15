package javaOOPsConcepts;

/**
 * Kapslung bedeutet, dass die Daten und der Code zu einer Einheit zusammenfasst werden.
 */
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		DogX dogX = new DogX("Pudel", "Emma", "Black");
		
		// auf private Variable kann außerhalb der Klasse nicht direkt zugegriffen werden
//		dog.breed
		
		System.out.println("Is " + dogX.getName() + " a " + dogX.getColor() + " " + dogX.getBreed() + "?");
		dogX.setBreed("Spanish water dog");
		System.out.println("No! " + dogX.getName() + " is a " + dogX.getColor() + " " + dogX.getBreed());
		
	}
}

class DogX {
	
	private String breed;
	private String name;
	private String color;
	public DogX(String breed, String name, String color) {
		this.breed = breed;
		this.name = name;
		this.color = color;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}