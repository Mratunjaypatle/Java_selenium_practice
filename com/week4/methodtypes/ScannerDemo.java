package com.week4.methodtypes;

import java.util.Scanner;

public class ScannerDemo {

	public int Add(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {

		System.out.print("Enter the name => ");

		Scanner reader = new Scanner(System.in);
		String str = reader.next();

		System.out.print("Enter your id => ");
		int id = reader.nextInt();

		System.out.print("Enter your age => ");
		int age = reader.nextInt();

		if (age >= 18) {
			System.out.println("Congratulations " + str);
			System.out.println("You are eligible");
		} else {
			System.out.println("You are not eligible");
		}
		reader.close();
	}

}
