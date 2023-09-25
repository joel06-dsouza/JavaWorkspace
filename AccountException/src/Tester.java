class Account{
	protected double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) throws Exception {
		if(amount > balance) {
			throw new Exception("Insufficient Balance..");
		}
		else if(amount > 15000) {
			throw new Exception("Overlimit");
		}
		balance = balance - amount;
	}
}


public class Tester {
	public static void main(String[] args) {
		Account acc = new Account(30000);
		try {
			acc.withdraw(20000);
			System.out.println(acc.balance);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
