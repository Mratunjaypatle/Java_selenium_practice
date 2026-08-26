package com.week6.arraytopics;

public class TwoDimensionArray {
	public static void main(String[] args) {

		int arr[][] = new int[2][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		System.out.println("Length of row is " + arr.length); // 2
		System.out.println("Length of column is " + arr[0].length);
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);

//		System.out.println(arr[2][2]);//ArrayIndexOutOfBoundsException
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);

		System.out.println("using loop");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("using for each loop");

		for (int r[] : arr) {
			for (int c : r) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

}
