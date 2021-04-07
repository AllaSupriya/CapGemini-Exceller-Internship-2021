package Day2_Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDup {

	public static void main(String[] args) {
		RemoveDup rd = new RemoveDup();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		System.out.println("Enter array: ");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int b[] = new int[n];
		b = rd.modifyArray(a,n);
		for(int i = 0;i < b.length;i++) {
        	System.out.print(b[i]+" ");
        }

	}

	private int[] modifyArray(int[] a, int n) {
		int c=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j] && a[i] != -1) {
					a[j] = -1;
					c++;
				}
			}
		}
		int b[] = new int[n-c];
		int j=0;
		for(int i=0;i<n;i++) {
			if(a[i]!=-1) b[j++]=a[i];
		}
		return b;
	}

}
