package Day1;

import java.util.Scanner;

public class EmployeeSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basic_salary = sc.nextInt();
		double HRA = (basic_salary*40)/100;
		double DA = ((HRA + basic_salary)*60)/100;
		double annual_salary = (basic_salary + HRA + DA)*12;
		System.out.println("Annual Salary : " + annual_salary);
		System.out.print("Annual Income after Tax deduction :");
		if(annual_salary < 200000) {
			System.out.println(annual_salary);
		}
		else if(annual_salary >= 200000 && annual_salary < 600000) {
			System.out.println(annual_salary-((annual_salary*10)/100));

		}
		else {
			System.out.println(annual_salary-((annual_salary*20)/100));;
		}		
	}
}