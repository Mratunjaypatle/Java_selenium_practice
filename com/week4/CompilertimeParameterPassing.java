package com.week4;

public class CompilertimeParameterPassing {

	public void add() // 0
	// instance method
	{
		int a = 10, b = 5; // local variable
		System.out.println("Addition is " + (a + b));
	}

	public void substract(int a, int b)// parameter and local variable
	{
		int c = a - b;
		System.out.println("Substraction is " + c);
	}

	/*
	 * When we want to return any data/result from the method where we are using
	 * return keyword.. There are some rules to use return keyword 1. We use return
	 * keyword , return statement in last line of the method. 2. We need to change
	 * return type for the method. 3. Return keyword returns the result of the
	 * calling function.
	 */

	public int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public String Info() {
		String msg = "Hello this is amit, today your task is to implement JDBC in library management project";
		return msg;
	}
	
	public boolean voting(int age)
	{
		if(age >= 18)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		CompilertimeParameterPassing c1 = new CompilertimeParameterPassing();
		c1.add();
		c1.substract(12, 2); // arguments
		c1.substract(100,9);

		int result = c1.mul(12, 10);
		System.out.println("Multiplication is " + result);
		System.out.println("The division is " + c1.div(100, 25));
		String message = c1.Info();
		System.out.println("The task is " + message);
		boolean resultVoting = c1.voting(12);
		System.out.println(resultVoting);
		
	}

}
