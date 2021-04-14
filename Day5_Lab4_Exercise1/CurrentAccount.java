package Day5_Lab4_Exercise1;

public class CurrentAccount extends Account{
	private double overdraft = 10000;

	public CurrentAccount(String accHolder, double balance) {
		super(accHolder, balance);
	}
	
	public void deposit(double wamount)
	{
		if((this.getBalance()-wamount) < overdraft)
			System.out.println("The balance after deposit in "+getAccHolder()+" is "+ getBalance());
		else
			System.out.println(getAccHolder()+" cannot deposit money any more it is over drafted.");
	}
	
	
}