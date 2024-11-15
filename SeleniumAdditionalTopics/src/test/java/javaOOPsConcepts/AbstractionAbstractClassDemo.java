package javaOOPsConcepts;

/**
 * Eine abstrakte Klasse kann sowohl abstrakte als nicht-abstrakte Methoden besitzen.
 */
public class AbstractionAbstractClassDemo {

	public static void main(String[] args) {
		
		// von abstrakten Klassen kann KEIN Objekt erzeugt werden
		// man kann aber ein Objekt von der Klasse erzeugen, die die abstrakte Klasse erweitert 
//		ClassX x1 = new ClassX();
		ClassY y1 = new ClassY();
		
		y1.methodA();
		y1.methodB();
	}
}

abstract class ClassX {
	// Variable können NICHT abstract gemacht werden
//	abstract int a = 5;
	
	// abstrakte Methoden dürfen KEINEN Body mit einer Implementierung haben
	public abstract void methodA();
//	{	
//		System.out.println("Ich bin eine abstrakte Methode.");
//	}
	
	// abstrakte Klassen können auch nicht-abstrakte Methoden besitzen
	public void methodB() {
		System.out.println("Ich bin eine normale (nicht-abstrakte) Methode.");
	}
}

/**
 * Wird eine Methode durch eine abstrakte Klasse erweitert, müssen ALLE unimplementierten 
 * abstrakten Methoden der Parent class übernommen und implementiert werden.
 */
class ClassY extends ClassX {

	@Override
	public void methodA() {
		System.out.println("Diese Methode wurde von der abstrakten Klasse vorgegeben "
				+ "und muss hier übernommen und implementiert werden..");
	}

}