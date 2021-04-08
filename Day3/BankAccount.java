package Day3;

public class BankAccount {

	private int accountNumber;
	private String accountHolderName;
	private int balance;
	private boolean status; 
	
	public BankAccount(int accountNumber,String accountHolderName,int balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	
	// true for active / false for inactive
	
	// -------- 

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isStatus() {
		if(balance<10000) return false;
		
		return true;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void accountDetails()
	{
		System.out.println("Account Holder name: "+getAccountHolderName());
		System.out.println("Account Balance: "+getBalance());
		if(isStatus()) {
			System.out.println("Status is Active\n");
		}else {
			System.out.println("Status is Inactive\n");
		}
	}

	// business methods
	public int doWithdrawal(int amount)
	{
		balance -= amount;
		return balance; // new balance
	}
	
	public int doDeposit(int amount)
	{
		balance+=amount;
		return balance;
	}
	
}