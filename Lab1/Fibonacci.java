package Lab1;
import java.util.*;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=1, n2=1;
		Fibonacci fib=new Fibonacci();
		
		System.out.println("Enter 0 for non-recursive method\nEnter 1 for recursive function:");
		int s = sc.nextInt();
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		
		switch(s) {		
		case 0: System.out.print(fib.nonrecFib(n));
			break;
				
		case 1: 
			System.out.println(fib.recFib(n));
			break;
			
		default:
			System.out.println("Wrong Entry");
			
		}
	}	
	
	public int nonrecFib(int n) {
		int num3=0,num1=1,num2=1;
		for(int i=3; i<=n; i++)	{
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}
		return num3;
	}
	
	public int recFib(int n){
		if(n<=1) {
			return n;
		}
		return recFib(n-1)+recFib(n-2);
	}

}
