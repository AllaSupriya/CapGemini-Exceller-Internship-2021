package Day7_Lab5;

public class Person implements AutoCloseable {
	private int age;
	private String name;
	private double salary;
	
	public Person(int age,String name,double salary) throws AgeException,NameException,salaryException{
		if(age<15) {
			throw new AgeException("Cannot allow age less than 15 and you age is "+age);
		}else {
			this.age = age;
			System.out.println("valid age");
		}
		
		String[] a = name.split(" ");
		if(name.isEmpty()||name==null||a.length != 2||a[0].equals("")) {	
			throw new NameException("Invalid Name Format");
				
		}else {
			this.name = name;
			System.out.println("Hello "+name);
		}
		
		if(salary < 3000) {
			throw new salaryException("Salary Exception Occured");
		}else {
			this.salary = salary;
			System.out.println("Valid salary");
		}
	}

	@Override
	public void close() throws Exception {
		// TO close
		
	}
}
