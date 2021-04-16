package Lab3_Strings;

import java.util.Scanner;

public class ImageString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		StringBuffer str = new StringBuffer(sc.nextLine());
		System.out.println(str+"|"+new ImageString().getImage(str));
	}
	public StringBuffer getImage(StringBuffer str1) {
		str1.reverse();
		return str1;
	}
}
