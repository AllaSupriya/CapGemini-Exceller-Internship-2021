package Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<=n; i++){
            for (int j=n; j>i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=(i * 2) -1; k++){
                if( k == 1 || k == (i * 2) -1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=n-1; i>=1; i--){
            for (int j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=(i * 2) -1; k++){
                if( k == 1 || k == (i * 2) -1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
         
	}

}
