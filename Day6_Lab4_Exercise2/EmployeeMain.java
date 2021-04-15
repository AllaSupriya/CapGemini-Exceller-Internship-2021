package Day6_Lab4_Exercise2;

public class EmployeeMain {

	public static void main(String[] args) {
		Services s = new Services();
		s.setEmpId(101);
		s.setEmpName("abc");
		s.setSalary(75000);
		s.setDesignation("Software Engineer");
		
		/*InsertEmployee ie = new InsertEmployee();
		ie.insert(s);
		*/
		
		s.displayDetails();
		s.findInsScheme(s.getSalary());
	}

}

