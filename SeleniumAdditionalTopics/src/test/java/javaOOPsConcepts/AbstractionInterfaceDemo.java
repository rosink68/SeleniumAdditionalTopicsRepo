package javaOOPsConcepts;

public class AbstractionInterfaceDemo {

	public static void main(String[] args) {
		
		// von einem Interface kann kein Objekt erzeugt werden, aber von der 
		// Klasse, die das Interface implements
//		DemoInterface bank = new DemoInterface();
		HDFC bankHdfc = new HDFC();
		bankHdfc.depositMoney();
		bankHdfc.viewBalance();
		bankHdfc.transferAmount();
		bankHdfc.openFixedDeposit();
		bankHdfc.interestDeposit();
		
		System.out.println("---------------------------------------");
		
		// man kann zwar von einem Interface kein Objekt mit nwe erzeugen, ABER
		// man kann dem Interface eine Referenz auf ein erzeugtes Objekt zuweisen
		DemoInterface dInterface = bankHdfc;
		dInterface.depositMoney();
		dInterface.viewBalance();
		dInterface.transferAmount();
		dInterface.openFixedDeposit();
	}
}
