package Day3;

public class BankApp {

	public static void main(String[] args) {
		
		
		/* business use case
		 * -------------------
		 * if balance is less than 10,000 :- account holder cannot withdrawal 
		 * in such case account status should be inactive.
		 *  
		 * */
		
		BankAccount ba1=new BankAccount(1201,"abc",50000);
		ba1.accountDetails();//displaying account details
		if(ba1.doWithdrawal(10000) < 10000) {
			System.out.println("Account holder cannot withdrawal");
		}
		ba1.accountDetails();
		ba1.doDeposit(12000);
		ba1.accountDetails();
		
		System.out.println("======================================================");
		
		BankAccount ba2=new BankAccount(1202,"xyz",8000);
		ba2.accountDetails();
		if(ba2.doWithdrawal(4000) < 10000) {
			System.out.println("Account holder cannot withdrawal");
		}
		ba2.accountDetails();
		ba2.doDeposit(5000);
		ba2.accountDetails();
		
		
	}
}