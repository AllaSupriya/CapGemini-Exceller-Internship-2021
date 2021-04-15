package Day6_Strings;

public class StringDemo {

	public static void main(String[] args) {

		//new StringDemo().task1();
		//new StringDemo().task2();
		new StringDemo().task5(); 
	}

	void task1()
	{
		String str = new String("Hello");
		//str.concat(" Java");
		str = str.concat(" Java");
		System.out.println(str);


		str=str.toLowerCase();
		System.out.println(str);
	}

	void task2()
	{
		String s1 = new String("  ABC");
		String s2 = new String("abc");
		String s3 = "ABC";
		String s4 = "ABC";

		boolean a = (s1 == s2); // false
		boolean b = (s3 == s4); // true

		boolean c = s1.equals(s2); //  false
		boolean d = s1.equalsIgnoreCase(s2); // true

	}

	// Spring API 
	void task3()
	{
		String s1 = "  abc  ";
		System.out.println(s1.length());

		s1 = s1.trim();
		System.out.println(s1.length());

		String s2 = "0123456789";
		s2 = s2.substring(5,8);
		System.out.println(s2);

		String s3 = "mike@gmail.com";
		char ch = s3.charAt(5);
		System.out.println(ch);

		char chArr[] = s3.toCharArray();
		// ======================================

		String s4 = "Hello How Are You!!";
		String arr[] = s4.split(" ");

		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println();
		System.out.println();
		//============================




	}

	// -- Home Work ---
	void task4()
	{

		String s1 = "abc.xyz@gmail.com";

		// split on the basis of .
		String arr1[] = s1.split("[.]");

		for (String str : arr1) {
			System.out.println(str);
		}System.out.println();

		String s2 = "Spring,Hibernate,Spring-Rest,Angular,React";
		// Split on the basis of ,
		String arr2[] = s2.split("[,]");

		for (String str : arr2) {
			System.out.println(str);
		}System.out.println();

		String s3 = "3+2=5";
		// split on the basis of +
		String arr3[] = s3.split("[+]");

		for (String str : arr3) {
			System.out.println(str);
		}
		System.out.println();

		String s4 = "mike@gmail.com";
		// split on the basis of regular exp
		// read of regular exp 
		String arr4[] = s4.split("[!@#$%^&*.,;:]");

		for (String str : arr4) {
			System.out.println(str);
		}
		System.out.println();
	}

	void task5()
	{

		String s = "Hello dog how are you idiot";
		/* output:- Hello ### how are you #####  * */
		String s1 =  s.replaceAll("dog","###").replaceAll("idiot", "#####");
		System.out.println(s1);
	}

}