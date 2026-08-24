package com.week5;

class A {
	A(ThisDemo t1) {
		System.out.println("amount is " + t1.amount);
	}
}

public class ThisDemo {
	// this can be passed as an argument in the constructor call.

	int amount = 1000;

	public ThisDemo() {
		System.out.println("Default constructor is calling .... ");
//		System.out.println("amount is " + amount);
		A a1 = new A(this);

	}

	public static void main(String[] args) {

		ThisDemo t1 = new ThisDemo();
	}
}
