package com.week6.arraytopics;

import java.sql.RowId;

public class MultiDimesionalTask {
	public static void main(String[] args) {
		Object userData[][] = { { "Username", "Password" }, { "Adam", 12345 }, { "Navid", "admin123" },
				{ "Pallav", "abc@123" }, { "Nikita", 123456 } };

		System.out.println("The length of row is " + userData.length); // Output: 5
		System.out.println("The length of column is " + userData[1].length); // Output: 2
		System.out.println("\n--- User Data Table ---");

		for (int row = 1; row < userData.length; row++) {
			for (int column = 0; column < userData[row].length; column++) {
				System.out.print(userData[row][column] + "\t"); // Using \t (tab) for clean spacing
			}
			System.out.println(); // Moves cursor to the next line after completing a row
		}

		// using for each loop
		System.out.println("-------using for each loop------");
		for (Object i []  : userData) {
			for (Object j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}

}
