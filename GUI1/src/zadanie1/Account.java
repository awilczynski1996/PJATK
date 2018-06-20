package zadanie1;

public class Account {
	private double balance;
	private static double interstRate = 0;
	
	public Account() {
		this.balance = 0;
	}
	
	public void deposit(double cashAmount) {
		this.balance += cashAmount;
	}
	
	public boolean withdraw(double cashToWithdraw) {
		if(this.balance - cashToWithdraw >= 0) {			
			this.balance -= cashToWithdraw;
			
			return true;
		}
		
		return false;
	}
	
	public boolean transfer(Account accountToTransfer, double cashToTransfer) {
		if(this.withdraw(cashToTransfer)) {			
			accountToTransfer.deposit(cashToTransfer);
			
			return true;
		}
		
		return false;
	}
	
	public void addInterest() {
		this.balance += this.balance * (Account.interstRate / 100);
	}
	
	public static boolean setInterestRate(double newInterstRate)
	{
		if(newInterstRate > 0) {			
			Account.interstRate = newInterstRate;
			
			return true;
		}
		
		return false;
	}
	
	public static double getInterestRate()
	{
		return Account.interstRate;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
}
