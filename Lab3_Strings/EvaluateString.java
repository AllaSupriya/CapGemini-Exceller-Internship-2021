package Lab3_Strings;

import java.util.*;
import java.io.*;
public class EvaluateString {
	public static void main(String args[])	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentence");
		String str=sc.nextLine();
		
		char[] a = str.toCharArray();
		System.out.println("\nNumber of characters : "+a.length);
		
		String[] b = str.split(" ");
		System.out.println("\nNumber of words : "+b.length);	
		
		String[] c = str.split("\n");
		System.out.println("\nNumber of lines : "+c.length);


	}
}
