package Day7_Lab5;

import java.util.Scanner;

/* Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.
*/
public class ValidateAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int n = sc.nextInt();
		ValidateException v = new ValidateException();
		try {
			v.doValidate(n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
