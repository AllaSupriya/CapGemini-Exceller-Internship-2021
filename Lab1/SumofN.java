package Lab1;
import java.util.*;

public class SumofN {
		
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	
		SumofN obj = new SumofN(); 
		System.out.println(obj.calculateSum(N));	
	}
	public int calculateSum(int n)	{
		int res=0;
		for(int i=1;i<=n;i++) {
			if(i%3 == 0||i%5 == 0) res+=i;
		}
		return res;
	}
}
