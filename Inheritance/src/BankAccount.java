
public class BankAccount {
	String accountholder;
	double balance;
	
	void deposite(double amount) {
		
		balance += amount;
		System.out.println("Deposite: "+ amount);
	}
	
	void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdraw:"+ amount);
	}

}
