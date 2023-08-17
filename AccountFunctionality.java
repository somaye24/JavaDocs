package bankFunctionality;

public class AccountFunctionality {
	
	String accountNumb;
	double balance;
	
	public AccountFunctionality(String accountNum, double balance) {
		this.accountNumber = accountNum;
		this.balance = balance;
	}
	public void deposite(double amount) {
		balance = amount+balance;
	}
	public void withdraw(double amount) {
		if(balance>=amount) {
			balance = balance - amount;
		}
			else {
				System.out.println("The balance is not sufficient");
			}
	}
	public double getBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
	
		AccountFunctionality BA1234 = new AccountFunctionality("BA1234",800);
		BA1234.deposite(300);
		System.out.println("New balance is : "+BA1234.getBalance());
		
		BA1234.withdraw(600);
		System.out.println("New balance is : "+BA1234.getBalance());
		
		BA1234.withdraw(900);
		System.out.println("New balance is : "+BA1234.getBalance());
}
}
