class Account {
	private int balance;
	
	public Account() {
		balance =10000;
	}
	
	public synchronized void deposit(int amount)
	{
		System.out.println("Balance before Deposit - "+balance);
		balance = balance + amount;
		System.out.println("Balance after Deposit - "+balance);
	}
	
	public synchronized void withdraw(int amount)
	{
		System.out.println("Balance before Withdraw - "+balance);
		balance = balance - amount;
		System.out.println("Balance after Withdraw - "+balance);
	}
}

class AccountUser extends Thread{
	String name, tot;
	int amt;
	Account acc;

	
	public AccountUser(String name, Account acc, String tot, int amt) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.acc = acc;
		this.tot = tot;
		this.amt = amt;
	}
	
	public void run() {
		if(tot.equals("deposit")) {
			acc.deposit(amt);
		}
		else if(tot.equals("withdraw")) {
			acc.withdraw(amt);
		}
	}

}

public class Tester {

	public static void main(String[] args) {
		Account acc = new Account();
		AccountUser user1 = new AccountUser("abs",acc,"deposit", 5000);
		AccountUser user2 = new AccountUser("xyz",acc,"withdraw", 2000);
		user1.start();
		user2.start();
	}

}
