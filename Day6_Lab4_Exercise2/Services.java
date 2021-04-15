package Day6_Lab4_Exercise2;

public class Services extends Employee implements EmployeeServices  {

	@Override
	public void findInsScheme(double salary) {
		
		if(salary > 100000 ) {
			System.out.println("Policy1");
		}else if(salary >= 50000 && salary < 99000) {
			System.out.println("Policy2");
		}else {
			System.out.println("Policy3");
		}
		
		
	}

	@Override
	public void displayDetails() {
		
		System.out.println("Employee Id: "+getEmpId());
		System.out.println("Employee Name: "+getEmpName());
		System.out.println("Employee Salary: "+getSalary());
		System.out.println("Employee Deignation: "+getDesignation());
		
		
	}
}