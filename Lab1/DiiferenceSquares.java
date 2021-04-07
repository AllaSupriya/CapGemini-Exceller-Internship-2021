package Lab1;

import java.util.Scanner;

public class DiiferenceSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	
		DiiferenceSquares ds = new DiiferenceSquares(); 
		System.out.println(ds.calculateDifference(N));
	}

	private int calculateDifference(int n) {
		// TODO Auto-generated method stub
		int s1=0,s2=0;
		for(int i=1;i<=n;i++) {
			s1+=(i*i);
			s2+=i;
		}
		return s1-(s2*s2);
	}

}
