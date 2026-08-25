package com.week5.thiskeywordandconstructor;

public class StaticVsInstanceVariable {

	int count = 1; // instance variable
	static int count2 = 1;

	public StaticVsInstanceVariable() {
		System.out.println(count2);
		count2++;
	}

	// count will not increase because instance variable gets every time new memory
 

	// if we use static variable then count will increase because static variable
	// does not get new memory every time.
	public static void main(String[] args) {
		StaticVsInstanceVariable s1 = new StaticVsInstanceVariable();
		StaticVsInstanceVariable s2 = new StaticVsInstanceVariable();
		StaticVsInstanceVariable s3 = new StaticVsInstanceVariable();
		StaticVsInstanceVariable s4 = new StaticVsInstanceVariable();
		StaticVsInstanceVariable s5 = new StaticVsInstanceVariable();

	}

}
