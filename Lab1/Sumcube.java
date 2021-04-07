package Lab1;

import java.util.Scanner;

public class Sumcube {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		Sumcube obj = new Sumcube();
		System.out.println("The sum of the cubes of the digits of a number is " + obj.cube(n));	
	}
	public int cube(int n)	{
		int sum = 0,rem;
		while(n != 0)
		{
			rem = n % 10;
			sum += rem*rem*rem;
			n = n/10;
		}
		return sum;
	}
}