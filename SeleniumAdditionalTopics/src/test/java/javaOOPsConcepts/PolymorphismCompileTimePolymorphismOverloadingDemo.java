package javaOOPsConcepts;


/**
 * Polymorphism: one thing in multiple forms
 * 
 * Beispiel Overloading: 
 * multiple Methoden haben den selben Namen, aber unterschiedliche Signatur und/oderParameter
 */
public class PolymorphismCompileTimePolymorphismOverloadingDemo {

	// gleichnamige Konstruktoren

	public PolymorphismCompileTimePolymorphismOverloadingDemo(int a, int b) {
		
		System.out.println("The sum of " + a + " and " + b + " is: " +(a+b));
	}

	public PolymorphismCompileTimePolymorphismOverloadingDemo(int a, double b) {
		
		System.out.println("The sum of " + a + " and " + b + " is: " +(a+b));
	}

	public PolymorphismCompileTimePolymorphismOverloadingDemo(double a, int b) {
		
		System.out.println("The sum of " + a + " and " + b + " is: " +(a+b));
	}

	public PolymorphismCompileTimePolymorphismOverloadingDemo(double a, double b) {
		
		System.out.println("The sum of " + a + " and " + b + " is: " +(a+b));
	}

	public PolymorphismCompileTimePolymorphismOverloadingDemo(int a, int b, int c) {
		
		System.out.println("The sum of " + a + " and " + b + " and c " + c + " is: " +(a+b+c));
	}

	
	// gleichnamige Methoden
	
	public void add(int a, int b) {
		
		System.out.println("The sum of " + a + " and " + b + " is: " +(a+b));
	}

	public void add(int a, double b) {
		
		System.out.println("The sum of " + a + " and " + b + " is: " +(a+b));
	}

	public void add(double a, int b) {
		
		System.out.println("The sum of " + a + " and " + b + " is: " +(a+b));
	}

	public void add(double a, double b) {
		
		System.out.println("The sum of " + a + " and " + b + " is: " +(a+b));
	}

	public void add(int a, int b, int c) {
		
		System.out.println("The sum of " + a + " and " + b + " and c " + c + " is: " +(a+b+c));
	}
	
	
}
