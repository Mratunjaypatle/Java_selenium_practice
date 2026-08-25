package com.week5.thiskeywordandconstructor;

public class MethodChaining {

	public MethodChaining setName(String name) {
		System.out.println("Name is =>" + name);
		return this;
	}

	public MethodChaining setCity(String city) {
		System.out.println("City is =>" + city);
		return this;
	}

	public MethodChaining setSalary(int salary) {
		System.out.println("Salary is => " + salary);
		return this;
	}

	
	public static void main(String[] args) {
		MethodChaining m = new MethodChaining();
		m.setName("Mratunjay Patle").setCity("Hyderabad").setSalary(250000);
	}
}
