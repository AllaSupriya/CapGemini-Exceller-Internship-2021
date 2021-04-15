package Day7;

import java.io.File;
import java.io.IOException;

import Day5.Animal;
import Day5.Cat;
import Day5.Dog;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// new ExceptionHandlingDemo().allRuntimeExceptions();
		//new ExceptionHandlingDemo().usingCheckedException();

		
		try {
			new ExceptionHandlingDemo().throwDemo();
		} catch (IOException e) {
			System.out.println(" Inside catch ");
			System.out.println(e.getMessage());
		}
		
	}//end main
	
	void throwDemo()throws IOException
	{
		
		String filePath = "e:abc.txt";
		File f = new File(filePath);
		
		if(filePath.contains("\\"))
		{
			System.out.println("Valid file path");
			boolean isFileCreated = f.createNewFile();
		}
		else
		{
			// Objective :- throw checked Excception
			throw new IOException("Not valid file path");
		}
	}

	void allRuntimeExceptions() {
		// showNullPointerException();
		// showClassCastException();
		// otherExceptions();
	}

	void showNullPointerException() {
		String str = null;
		str.toLowerCase(); // using . over null value
	}

	void showClassCastException() // During Collections
	{
		Animal a = new Dog();
		// a.playGames(); // code inside dog (specific to dog only)

		Cat d = (Cat) a;
	}

	void otherExceptions() {
		/*
		 * int arr[] = new int[5]; arr[5] = 44;// Arithmatic Exception
		 * 
		 * 
		 * String str = "abc"; char ch = str.charAt(45); // StringIndexOut.....
		 * 
		 * 
		 * String str3 = "ten"; // "1-58 " , "sdfer" int x = Integer.parseInt(str3);; //
		 * Notformat Exce...
		 */

		int amount = 9090;
		int noOfUsers = 0; // ....
		System.out.println("A1");
		try {
			System.out.println(" A2 ");
			System.out.println(amount / noOfUsers);
			System.out.println(" B1"); // code to end the process
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("B2");

	}

	void usingCheckedException() {
		String path = "xyz:\\ABC.txt";
		File file = new File(path);
		
		// boolean x2 = file.createNewFile(); // error becoz method declared using throws
		
		
		try {
			boolean x = file.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}

	}


	


}

