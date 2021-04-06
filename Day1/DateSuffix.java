package Day1;

import java.util.Scanner;

public class DateSuffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		if(date < 1 || date > 31) {
			System.out.println("Invalid date");
		}
		else {
			int rem = date % 10;
			if(rem == 1) {
				System.out.println(date+"st");
			}
			else if(rem == 2) {
				System.out.println(date+"nd");
			}
			else if(rem == 3) {
				System.out.println(date+"rd");
			}
			else {
				System.out.println(date+"th");
			}
		}
		
		
		

	}

}
