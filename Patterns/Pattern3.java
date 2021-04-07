package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i < n;i++) {
			for(int j = n - i;j > 1;j--) {
				System.out.print(" ");
			}
			for(int j = 0;j <= i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 0;i < n;i++) {
			for(int j = 0;j <= i;j++) {
				System.out.print(" ");
			}
			for(int j = n-i;j > 1;j--) {
			    System.out.print("* ");
			}
			System.out.println();
		}
         
	}

}
	