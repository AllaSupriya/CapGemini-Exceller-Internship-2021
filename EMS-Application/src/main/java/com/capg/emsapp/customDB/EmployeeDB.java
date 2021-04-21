package com.capg.emsapp.customDB;
// Dummy Database for employee

import java.util.ArrayList;
import java.util.List;

import com.capg.emsapp.beans.Employee;

public class EmployeeDB {

	public static List<Employee> empList = new ArrayList<Employee>();
	
	static
	{
		Employee e1 = new Employee("mike",101,20000,"Project ABC","Programmer","Scheme B");
		Employee e2 = new Employee("suresh",102,12000,"EMS Application","System Associate","Scheme C");
		Employee e3 = new Employee("Ramesh",103,3000,"Java Application","Clerk","No Scheme");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
	
	}
	
	public static boolean addEmployee(Employee e)
	{
	   return empList.add(e);	
	}
	
}
