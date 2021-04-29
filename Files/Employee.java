package Files;

public class Employee {
	private int empId;
	private String empName;
	private String empDept;
	private int salary;
	public Employee(int empId, String empName, String empDept, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", salary=" + salary
				+ "]\n\n";
	}
	
	
}
