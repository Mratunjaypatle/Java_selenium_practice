package com.week4;

import java.util.Scanner;

public class RunTimeParameterPassing {

	public void add(int a, int b) {
		System.out.println("Addition is " +(a+b));
	}

	public static void main(String[] args) {

		RunTimeParameterPassing obj = new RunTimeParameterPassing();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number =>");
		int a = sc.nextInt();

		System.out.print("Enter second number =>");
		int b = sc.nextInt();

		obj.add(a,b);

	}
}
