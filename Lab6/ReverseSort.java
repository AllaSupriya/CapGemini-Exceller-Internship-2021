package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number of elements in array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements:");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = getSortReverse(a);
		System.out.println("Final Array is")
		for(int i = 0; i < n; i++) {
			System.out.println(b[i]);
		}
	}

	public static int[] getSortReverse(int[] a) {
		int[] b = new int[a.length];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i : a) {
			list.add(reverse(i));
		}
		Collections.sort(list);
		int j=0;
		for(int i:list) {
			b[j++] = i;
		}
		return b;
	}

	private static Integer reverse(int num) {
		int reversed = 0;

	    while(num != 0) {
	    
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	      num /= 10;
	    }
		return reversed;
	}
}
