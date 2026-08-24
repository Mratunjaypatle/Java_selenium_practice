package com.week5;

public class ConstructorCalling {

	
	// this() can be used to invoke current class constructor
	// constructor call must be first statement of that constructor.
	// constructor calling using this()
	public ConstructorCalling() {
		this(100);
		System.out.println("Default constructor is calling..");
	}
	public ConstructorCalling(int id) {
//		this();
		System.out.println("Parameteriezed constructor is calling.." + id); 
	}
	
	// this can be passed as an argument in the method calling..
	
	public void show(StudentData s1) {
		System.out.println("show () is calling");
		s1.display();
		// this keyword is used to pass current class object
		show2(this);
	}
	
	public void show2(ConstructorCalling obj)
	{
		System.out.println("message from show2 method");
	}
	
	public static void main(String[] args) {
		ConstructorCalling obj = new ConstructorCalling();
		StudentData s1 = new StudentData(101, "bittu");
		// method calling using object
		obj.show(s1);
	}
}
