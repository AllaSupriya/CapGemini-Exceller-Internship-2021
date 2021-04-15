package Day6_Lab4_Exercise2;

public class Employee {

	private int EmpId;
	private String EmpName;
	private double Salary;
	private String Designation;
	private String InsuranceScheme;
	
	public Employee() {
		super();
	}
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getInsuranceScheme() {
		return InsuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		InsuranceScheme = insuranceScheme;
	}
	
}
/*
 * Exercise 2:	 create packages and classes as given below:
com.cg.eis.bean
	In this package, create “Employee” class with different attributes such as id, name, salary, designation, 
	insuranceScheme.
com.cg.eis.service
		This package will contain code for services offered in Employee Insurance System. The service class will have
		 one EmployeeService Interface and its corresponding implementation class.
The services offered by this class are:
Get employee details from user.
Find the insurance scheme for an employee based on salary and designation.
Display all the details of an employee.
com.cg.eis.pl
		This package will contain code for getting input from user, produce expected output to the user and invoke 
		services offered by the system.
*/