package Patterns;

import java.util.Scanner;

public class Pattern1c {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 1,c1 = 2;
		for(int i = 0;i < n;i++) {
			for(int j = 0;j <= i;j++) {
				if(i % 2 == 0) {
					System.out.print(c+" ");
					c = c + 2;
				}else{
					System.out.print(c1+" ");
					c1 = c1 + 2;
				}
			}
			System.out.println();
		}

	}

}
