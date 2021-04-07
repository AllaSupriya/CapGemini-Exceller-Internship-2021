package Day2_Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseSort rs = new ReverseSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		System.out.println("Enter array: ");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int b[] = new int[n];
		b = rs.getSort(a,n);
		for(int i = 0;i < n;i++) {
        	System.out.print(b[i]+" ");
        }
	}

	private int[] getSort(int[] a, int n) {
		for(int i = 0;i < n;i++) {
			int rev = 0;
			while(a[i] > 0) {
				int temp = a[i] % 10;
				rev = (rev*10) + temp;
				a[i] /= 10;
			}
			a[i] = rev;
		}
		Arrays.sort(a);
		return a;
	}

}
