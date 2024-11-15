package handlingRandomActivities;

import java.util.Random;


public class GeneratingRandomNumbersDemo {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		// Erzeugen von 200 Zufallszahlen zwischen 0 und 99
		for(int i=0; i<200; i++) {
			System.out.println(random.nextInt(100)); // beginnt immer bei 0
		}
	}
}
