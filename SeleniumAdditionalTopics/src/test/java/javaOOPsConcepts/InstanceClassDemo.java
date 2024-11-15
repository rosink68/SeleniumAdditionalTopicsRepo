package javaOOPsConcepts;

public class InstanceClassDemo {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Dobermann", "Ginger", "Black");
		dog1.behaviorDog();
		
		Dog dog2 = new Dog("Pug", "Ruby", "Brown");
		dog2.behaviorDog();
		
		Dog dog3 = new Dog("Dalmatian", "Piper", "White with black points");
		dog3.behaviorDog();
		
	}
	
}

class Dog {
	
	// state = variable
	String breed;
	String name;
	String color;

	public Dog(String breed, String name, String color) { 
		this.breed = breed;
		this.name = name;
		this.color = color;
	}
	
	// behavior = methods
	public void barking() {

		System.out.println(breed + " " + name + " is barking.");
	}

	public void eating() {

		System.out.println(breed + " " + name + " is eating.");	
	}

	public void sleeping() {

		System.out.println(breed + " " + name + " is sleeping.");			
	}

	public void walking() {

		System.out.println(breed + " " + name + " is walking.");			
	}

	public void running() {

		System.out.println(breed + " " + name + " is running.");
	}
	
	public void behaviorDog() {
		barking();
		eating();
		sleeping();
		walking();
		running();		
		System.out.println("-------------------------------");
	}
}
