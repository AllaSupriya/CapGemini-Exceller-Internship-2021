package Lab1;

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	
		IncreasingNumber in = new IncreasingNumber(); 
		boolean f = in.checkNumber(N);
		if(f){
	           System.out.println("Digits are in increasing order.");
	    }else{
	           System.out.println("Digits are not in increasing order.");
	    }
	}

	boolean checkNumber(int n) {
		// TODO Auto-generated method stub
		int s = n%10;
		n/=10;
		while(n>0) {
			if(s<n%10) {
				return false;
			}
			s = n%10;
			n/=10;
		}
		return true;
	}

}
