package javaOOPsConcepts;

/**
 * Durch ein Interface werden ALLE Methoden deklariert, die erforderlich sind.
 * 
 * Ein Interface hat 100% abstrakte Methoden.
 */
public interface DemoInterface {
	
	// Variablen in einem Interface sind defaultmäßig static und final
	// d.h die Werte können nicht geändert werden
	String accountType1 = "Savings";
	String accountType2 = "Current";
	
	
	// 100% der Methoden haben KEINEN Body
	public void depositMoney();
	
	public void viewBalance();
	
	public void transferAmount();
	
	public void openFixedDeposit();
}

class HDFC implements DemoInterface {

	@Override
	public void depositMoney() {
		System.out.println("Money deposited in HDFC Bank");	
	}

	@Override
	public void viewBalance() {
		System.out.println("Balance viewed in HDFC Bank");
	}

	@Override
	public void transferAmount() {
		System.out.println("Money transferred from HDFC Bank");
	}

	@Override
	public void openFixedDeposit() {
		System.out.println("Fixed deposit opened in HDFC Bank");
	}
	
	public void interestDeposit() {
		System.out.println("Interest amount deposited in HDFC Bank");
	}
}