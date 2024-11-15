package javaOOPsConcepts;

/**
 * Multilevel Inheritance bedeutet, eine Child class erbt von einer anderen Child class
 * und die wiederum erbt von einer Parent class
 * 
0 * Lion ==> Cats ==> Animals: Lion erbt alles von Cats und Animals; Cats erbt nur von Animals
 */
public class InheritanceMultiLevelInheritanceDemo {

	public static void main(String[] args) {
	
		
	}
}

class Animals {
	
}

class Cats extends Animals {
	
}

class Lion extends Cats {
	
}