package com.week6.arraytopics;

import java.util.Scanner;

public class StringArrayDemo {

	public static boolean chooseCity(String[] cities , String user) {
		for (int i = 0; i < cities.length; i++) {
			if (user.equalsIgnoreCase(cities[i])) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] cities = new String[5];
		cities[0] = "Mumbai";
		cities[1] = "Hyderabad";
		cities[2] = "Pune";
		cities[3] = "Nagpur";

		System.out.println("Enter your prefered city : ");
		String user = sc.next();
		boolean result = chooseCity(cities, user);
		System.out.println(result);

	}
}
