package com.week2;

public class VariablePractice {

	int id = 10; // instance variable
	static int score = 200;

	public void demo() {
		System.out.println(id);
	}

	public void show() {
		System.out.println(id);
	}

	public static void main(String[] args) {
	VariablePractice v1 = new VariablePractice();
	v1.show();
	System.out.println(score);
}
}
