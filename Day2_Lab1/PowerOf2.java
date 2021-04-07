package Day2_Lab1;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	
		PowerOf2 in = new PowerOf2(); 
		boolean f = in.checkPowerNumber(N);
		if(f){
	           System.out.println("Digit is power of 2.");
	    }else{
	           System.out.println("Digit is not power of 2.");
	    }
	}

	private boolean checkPowerNumber(int n) {
		// TODO Auto-generated method stub
		while(n>1) {
			if(n%2!=0) return false;
			n=n/2;
		}
		return true;
	}

}
