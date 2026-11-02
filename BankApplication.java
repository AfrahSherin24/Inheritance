//3. A banking application has three classes: BankAccount, SavingsAccount, and 
//PremiumSavingsAccount. 
//SavingsAccount inherits from BankAccount, while PremiumSavingsAccount inherits 
//from SavingsAccount.
//
//Write a Java program to demonstrate multilevel inheritance 
//and display account details at each level.

package FirstProgram;

class BankAccount1{
	void displayBankAccount1() {
		System.out.println("holder name: afrah, balance:50000 ");
	}
}

class SavingsAccount extends BankAccount1{
	void displaySavingsAccount() {
		System.out.println("intrest rate: 15%");
	}
	
}

class PremiumSavingsAccount extends SavingsAccount{
	void displayPremiumSavingsAccount() {
		System.out.println("premium benefits");
		
	}
	
}


public class BankApplication {

	public static void main(String[] args) {
		PremiumSavingsAccount obj = new PremiumSavingsAccount();
		obj.displayBankAccount1();
		obj.displaySavingsAccount();
		obj.displayPremiumSavingsAccount();
	

	}

}
