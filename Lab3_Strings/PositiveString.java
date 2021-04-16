package Lab3_Strings;

import java.util.Scanner;
public class PositiveString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int f=1;
		char arr[] = str.toCharArray();
		for(int i = 0;i < arr.length - 1;i++) {
			if(Character.compare(arr[i], arr[i+1])<0) {
				f=0;
				System.out.println("String is not Positive");
				break;
			}
		}
		if(f==1) System.out.println("String is Positive");
	}
}
