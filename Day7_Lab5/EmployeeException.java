package Day7_Lab5;

/*  Create an Exception class named as “EmployeeException”(User defined Exception) in a package named as 
 * “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000. Use Exception Handling 
 * mechanism to handle exception properly.*/

public class EmployeeException {
	public void validateSalary(double salary) throws salaryException{
		if(salary > 3000) {
			System.out.println("Valid salary");
		}else {
			throw new salaryException("Salary Exception Occured");
		}
	}
}
