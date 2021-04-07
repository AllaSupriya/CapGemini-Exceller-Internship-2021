package Lab1;
import java.util.*;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n=sc.nextInt();
		PrimeNumbers p = new PrimeNumbers();
		p.primesTillN(n);
	}
	public void primesTillN(int n) {
		if(n<2)
			System.out.println("Prime Numbers starts from 2 given number is less than 2");
		else {
			for(int i=2;i<=n;i++) {
				int j=2,f=0;
				while(j<=(int)i/2) {
					if(i%j==0) {
						f=1;
					    break;
					}
					j++;
				}
				if(f==0) {System.out.print(i+" ");}					
			}
		}
	}
}
