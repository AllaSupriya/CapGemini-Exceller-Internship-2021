package Day5_Lab4_Exercise1;

public class Account {
	private long accNum;
	private double balance;
	private String accHolder;
	 
	
	public Account(String name, double balance) {
		super();
		// TODO Auto-generated constructor stub
		accHolder = name;
		this.accNum = (long)Math.random() * 10000;
		this.balance = balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double damount)
	{
		this.balance = balance+damount;
		
	}
	
	public void withdraw(double wamount){
		if((this.balance - wamount) > 500){
			this.balance = balance-wamount;
			System.out.println("The balance after deposit in "+getAccHolder()+" is "+ getBalance());
		}else{
			System.out.println(accHolder + " can withdraw only "+ (balance-500));
		}
	}
}
