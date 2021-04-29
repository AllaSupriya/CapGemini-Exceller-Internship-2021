package Files;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class FileMap {		
	
	static List<Employee> l = new ArrayList<Employee>();

	public static void main(String[] args){
		File f = new File("C:\\Users\\Supriya\\OneDrive\\Desktop\\CoreJavaModule1\\EmployeeRecord.txt");
		FileMap obj = new FileMap();			
		
		try {
			obj.doReadFromFile(f);
			
		}catch(Exception e) {

		}
		Map<String,List<Employee>> map = new HashMap<String,List<Employee>>();
		map = l.stream().collect(Collectors.groupingBy(Employee::getEmpDept));
		System.out.println(map);
	}

	public void doReadFromFile(File f) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = "";		

		while((line = br.readLine())!=null)	{

			String[] empdetails = line.split(",");

			Employee e = new Employee(Integer.parseInt(empdetails[0]),empdetails[1],
					empdetails[2],Integer.parseInt(empdetails[3]));
			
			l.add(e);		
			
		}
	}

}
//aaabbbtttttyyyyyuuhh