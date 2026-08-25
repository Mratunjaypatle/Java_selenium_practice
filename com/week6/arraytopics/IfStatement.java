package com.week6.arraytopics;

import java.util.Scanner;

public class IfStatement {
	public void Positive() {
//		Write a Java program to check whether a number is positive, negative, or     		zero. 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
	}

	public static void main(String[] args) {
		IfStatement obj = new IfStatement();
		obj.Positive();
		for (int count = 1; count <= 10; count++) {
			if (count >= 5) {
				break;
			}else
			{
				System.out.println(count);
			}

		}
	}

}
