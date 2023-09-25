import java.util.Scanner;

class AccountHolder {
	private int ac_no;
	private String ac_name;
	private double balance;
	
	public AccountHolder(int ac_no, String ac_name, double balance) {
		this.ac_no = ac_no;
		this.ac_name = ac_name;
		this.balance = balance;
	}

	public int getAc_no() {
		return ac_no;
	}

	public void setAc_no(int ac_no) {
		this.ac_no = ac_no;
	}

	public String getAc_name() {
		return ac_name;
	}

	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		balance = amt + balance;
	}
	
	public void withdraw(double amt) {
		balance = balance - amt;
	}
	
	public void details() {
		System.out.println(ac_name+"\t"+ac_no+"\t"+balance);
	}
}


public class Tester {

	public static void main(String[] args) {
		int cnt=0, choice, acno;
		AccountHolder acc[] = new AccountHolder[10];
		Scanner sc = new Scanner(System.in);
		while(true) 
		{	
			System.out.println("1. Add Account Details");
			System.out.println("2. Display Account Details");
			System.out.println("3. Deposit Amount");
			System.out.println("4. Withdraw Amount");
			System.out.println("5. Exit");
			System.out.print("Enter your Choice -  ");
			
			choice= sc.nextInt();
			switch(choice) 
			{
				case 1:
					System.out.println("Enter Account Number, Account Holder Name, Account Balance: ");
					acc[cnt++]=new AccountHolder(sc.nextInt(), sc.next(), sc.nextDouble());
					break;
				case 2:
					System.out.println("All Account Details ");
					for(int i=0; i<cnt;i++) {
						acc[i].details();
					}
					System.out.println();
					break;
				case 3:
					System.out.print("Enter Account Number for deposit process: ");
					acno=sc.nextInt();
					for(int i=0; i<cnt; i++) {
						if(acno == acc[i].getAc_no()) {
							System.out.print("Amount Deposit: ");
							acc[i].deposit(sc.nextDouble());
						}	
					}
					break;
				case 4:
					System.out.print("Enter Account Number for withdraw process");
					acno=sc.nextInt();
					for(int i=0; i<cnt; i++) {
						if(acno == acc[i].getAc_no()) {
							System.out.print("Amount Withdraw: ");
							acc[i].withdraw(sc.nextDouble());
						}	
					}
					break;
				case 5:
					System.exit(0);
			}
		}
	}

}
