package com.week4.methodtypes;

import java.util.Scanner;

public class ReturnType {

	static String cnfPass = "hello@123";

	public static String TakeName(String name) {
		return "Hello my name is " + name;
	}

	public static int iphoneBudget(int customerBudget) {
		if (customerBudget >= 65000) {
			return 1; // positive
		}
		return 0; // negative
	}

	public boolean passwordChecker(String password) {
		if (password.equals(cnfPass)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		ReturnType obj = new ReturnType();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your name please");
//		String name = sc.next();
//		System.out.println(TakeName(name));
		System.out.print("Enter the budget for iphone :-> ");
		int aman = sc.nextInt();
		int result = iphoneBudget(aman);

		if (result == 1) {
			System.out.println("aman can afford it");
		} else {
			System.err.println("aman can't aford it");
		}
		System.out.print("Enter the password :-> ");
		String password = sc.next();
		boolean passwordResult = obj.passwordChecker(password);

		if(passwordResult == true)
		{
			System.out.println("Password is correct");
		}
		else
		{
			System.err.println("Password is incorrect");
		}
		
		sc.close();
	}

}
