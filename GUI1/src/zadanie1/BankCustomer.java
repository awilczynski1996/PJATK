package zadanie1;

public class BankCustomer {
	private Person person;
	private Account account;
	
	
	public BankCustomer(Person person) {
		this.person = person;
		this.account = new Account();
	}
	
	public Account getAccount()
	{
		return account;
	}
	
	public String toString()
	{
		return "Klient: " + this.person.getName() + " stan konta " + this.account.getBalance();
	}
}
