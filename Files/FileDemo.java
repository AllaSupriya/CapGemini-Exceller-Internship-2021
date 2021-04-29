package Files;

import java.io.*;
public class FileDemo {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Supriya\\OneDrive\\Desktop\\CoreJavaModule1\\collections.txt");
		//File f2 = new File("C:\\Users\\ashis\\OneDrive\\Desktop\\Capgemini Batch\\6 04 21 JA05 and JA16\\workspace\\CoreJavaModule1\\src\\io\\FIleHandlingDemo.java");
		FileDemo obj = new FileDemo();

		try {
			//	obj.doWriteOnFile(f);
			obj.doReadFromFile(f);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	public void doReadFromFile(File f)throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = "";
		int count = 0;
		int lineNumber = 1;
		while((line = br.readLine())!=null)
		{
			System.out.println(lineNumber+" "+line);
			boolean b = line.contains("is") || line.contains("IS");

			if(b)
			{
				// spilt based on regexp for File input
				String[] strArray = line.split("[ ]");
				for (int i=0; i<strArray.length; i++) {
					System.out.println(strArray[i]);
				}

				count++;
				//System.out.println("----->> line Number "+lineNumber+" & count "+count);
			}


			lineNumber++;
		}

		System.out.println("\n\n\n====>> Is count in file: "+count);
	}


	public void doWriteOnFile(File f)throws IOException
	{
		PrintWriter pw = new PrintWriter(new FileWriter(f));

		pw.append("gbfbfgnbgrfbnrgf");

		System.out.println("------------- Done ------------");
		pw.close();
	}

}
