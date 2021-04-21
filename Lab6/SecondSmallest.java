package Lab6;

import java.util.*;

public class SecondSmallest {
	public static void main(String[] args) {
		SecondSmallest obj = new SecondSmallest();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number of elements in array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements:");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(obj.getSecondSmallest(a)+" is second Smallest value " );
	}

	public int getSecondSmallest(int[] a) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i : a) {
			list.add(i);
		}
		Collections.sort(list);
		return list.get(1);
	}
}
