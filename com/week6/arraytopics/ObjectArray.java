package com.week6.arraytopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectArray {

	public static int CountPositive() {
		int a[] = { 12, 54, -67, -90, -54, 70  , 123};
		int i = 0;
		int count = 0;
		while (i < a.length) {
			if (a[i] > 0) {
				count++;
			}
			i++;
		}
		return count;
	}

	public static List<Integer> ReturnPositive() {
		int a[] = { 12, 54, -67, -90, -54, 70  ,123 , -87};
		List<Integer> positiveNumber = new ArrayList<>();
		int i = 0;
		while (i < a.length) {
			if (a[i] <  0) {
				positiveNumber.add(a[i]);
			}
			i++;
		}
		return positiveNumber;
	}

	public static void ObjectDataInput(Scanner sc) {

		Object stdData[] = new Object[5];
		System.out.println("Enter the name : ");
		stdData[0] = sc.next();
		System.out.println("Enter the ID");
		stdData[1] = sc.nextInt();
		System.out.println("Enter the address");
		stdData[2] = sc.next();
		System.out.println("Enter the percentage");
		stdData[3] = sc.nextFloat();
		System.out.println("Enter the Gender");
		stdData[4] = sc.next().charAt(0);

		for (int i = 0; i < stdData.length; i++) {
			System.out.println(stdData[i]);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// using Object class we can put any kind of data in our array..
		ObjectArray obj = new ObjectArray();
		Object empdata[] = new Object[5];
		empdata[0] = "Sanidhya";
		empdata[1] = "Pune";
		empdata[2] = 24;
		empdata[3] = 'M'; //Character  
		empdata[4] = 76.9;
		System.out.println("The length of the array is " + empdata.length);
		for (int i = 0; i < empdata.length; i++) {
			System.out.print(empdata[i] + " ");
		}

		// using literal
		Object stdData[] = { "Adarsh", "Mumbai", 'M', 23, 67.76 };
		System.out.println("using for loop");
		for (int i = 0; i < stdData.length; i++) {
			System.out.print(stdData[i] + " ");
		}
		System.out.println();
		System.out.println("using for each loop");
		for (Object i : stdData) {
			System.out.println(i + " ");
		}

		System.out.println();
//		ObjectDataInput(sc);
		System.out.println(CountPositive());
		System.out.println(ReturnPositive());

	}

}
