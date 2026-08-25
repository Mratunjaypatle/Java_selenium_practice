package com.week6.arraytopics;

import java.util.Scanner;

public class ArrayDemo {

	public static void CountMarks() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int students[] = new int[4];
		System.out.println("Enter the marks of students => ");
		
		for (int i = 0; i < students.length; i++) {
			students[i] = sc.nextInt();
		}
		
		for (int i = 0; i < students.length; i++) {
			sum += students[i];
		}
		
		float result = sum / students.length;
		System.out.println("Result is "  + result + "%");
	}

	public static void main(String[] args) {
		int arr1[] = new int[4];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;

		int arr2[] = new int[4];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		arr2[3] = 40;

		int length = arr1.length; // 4
		int sum[] = new int[4];

		System.out.println("Length of all arrays is " + length);

		System.out.print("Elements of array1 are => ");
		for (int i = 0; i < length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.print("Elements of array2 are => ");
		for (int i = 0; i < length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		// additional of arr1 and arr2
		System.out.print("Addition of array1 and array2 are => ");
		for (int i = 0; i < length; i++) {
			sum[i] = arr1[i] + arr2[i];
			System.out.print(sum[i] + " ");
		}
		System.out.println();

		CountMarks();
	}

}
