package Lab3_Strings;

import java.util.Scanner;
public class ConsonantReplace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();

		char arr[] = str.toCharArray();

		StringBuffer sb = new StringBuffer();
		for(int j = 0;j < arr.length;j++) {
			if(arr[j] == 'Z') {
				arr[j] = 'A';
			}else if(arr[j] == 'z') {
				arr[j] = 'a';
			}else if(!(arr[j] == 'a'||arr[j] == 'e'||arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u'||arr[j] == 'A'||arr[j] == 'E'||arr[j] == 'I' || arr[j] == 'O' || arr[j] == 'U')) {
				arr[j] = (char)(arr[j]+1);
			}
			System.out.print(arr[j]);
		}
	}

}
