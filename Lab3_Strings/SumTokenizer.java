package Lab3_Strings;

import java.util.*;
public class SumTokenizer {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String of Numbers separated by spaces");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        int sum=0;
        while(st.hasMoreTokens()) {
        	int i = Integer.parseInt(st.nextToken());
        	sum += i;	
        }
        System.out.println("The sum is: "+sum);
	}
        
}
