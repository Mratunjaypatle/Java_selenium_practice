package com.week1;

public class Tasks {

	int id;
	String name;

	int emp_id;
	String emp_name;
	int emp_salary;

	public void display() {
		int a = id;
		String c = name;
		System.out.println("id is " + a);
		System.out.println("name is " + c);
	}

	public void show() {
		System.out.println("Employer id is " + emp_id);
		System.out.println("Employer name is " + emp_name);
		System.out.println("Employer salary is " + emp_salary);
	}

	public static void main(String[] args) {
//	 to call a member of a class , we need object..
		Tasks s1 = new Tasks();
		
		s1.display();
		s1.id = 101;
		s1.name = "Ansh";
		s1.display();
		Tasks s2 = new Tasks();
		s2.id = 102;
		s2.name = "Bittu";
		s2.display();
		
		
		Tasks emp = new Tasks();
		emp.emp_id = 101;
		emp.emp_name = "Anish Sheikh";
		emp.emp_salary = 12000;
		emp.show();

		// make a class of employee and print the details of 5 employers.

	}

}
