package Lab3_Strings;

import java.util.Scanner;
public class NumberDifference {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		String num = sc.nextLine();

		char arr[] = num.toCharArray();
		StringBuffer str = new StringBuffer();
		
		for(int i = 0;i < arr.length - 1;i++) {
			str.append(Math.abs((int)arr[i]-(int)arr[i + 1]));
		}
		str.append(num.charAt(num.length()-1));
		System.out.println(str);
	}
}
