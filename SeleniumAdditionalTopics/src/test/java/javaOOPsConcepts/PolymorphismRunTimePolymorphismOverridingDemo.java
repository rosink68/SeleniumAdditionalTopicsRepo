package javaOOPsConcepts;


/**
 * Polymorphism: one thing in multiple forms
 * 
 * Beispiel Overriding:
 * wenn eine Methode in der Child class die Methode in der Parent class überschreibt
 */
public class PolymorphismRunTimePolymorphismOverridingDemo {

	public static void main(String[] args) {
		
		ClassA a1 = new ClassA();
		a1.add(5, 6);
		
		ClassB b1 = new ClassB();
		b1.add(5, 6);
		
		ClassC c1 = new ClassC();
		c1.add(5, 6);
	}
}

class ClassA {

	public ClassA() {
		
	}
	
	public void add(int a, int b) {
		
		System.out.println("ClassA - The sum of " + a + " and " + b + " is: " +(a+b));
	}
}

class ClassB extends ClassA {
	
	// Konstruktoren der Parent class können nicht in der Child class dupliziert werden,
	// da Konstruktoren immer den Namen der Klasse haben
	public ClassB() {
		
	}

	public void add(int a, int b) {
		
		System.out.println("ClassB - The sum of " + a + " and " + b + " is: " +(a+b));
	}
}

class ClassC extends ClassA {

	public void add(int a, int b, int c) {
		
		System.out.println("ClassC - The sum of " + a + " and " + b + " and " + c + " is: " +(a+b+c));
	}
}