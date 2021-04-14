package Day5_Lab4_Exercise1;

public class SavingsAccount extends Account{
	
	
	final double minBalance = 500;
	
	
	public SavingsAccount(String accHolder, double balance) {
		super(accHolder, balance);
	}

	public void withdraw(double wamount)
	{
		if((this.getBalance() - wamount) > minBalance)
		{
			this.setBalance(this.getBalance() - wamount);
			System.out.println("The balance after withdraw  in "+getAccHolder()+" is "+ getBalance());
		}
		else
		{
			System.out.println("Withdraw not possible");
		}
	}
}