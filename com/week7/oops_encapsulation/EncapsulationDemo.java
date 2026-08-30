package com.week7.oops_encapsulation;

class Employee {

	// Encapsulation -> private data + public function(method)
	private int id = 101;
	private String name = "Aditya kumar";
	private int salary = 80000;
	private int age = 26;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void show() {
		System.out.println("Employe details are :- ");
		System.out.println("Employee id is => " + id);
		System.out.println("Employee name is => " + name);
		System.out.println("Employee salary is => " + salary);
		System.out.println("Employee age is => " + age);
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Aditya Sharma");
		e1.setSalary(90000);
		e1.show();
		System.out.println(e1.getId() + ":" +e1.getName() + ":" +e1.getSalary() + ":" +e1.getAge()  );
	}

}
