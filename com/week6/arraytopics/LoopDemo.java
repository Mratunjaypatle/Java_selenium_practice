package com.week6.arraytopics;

public class LoopDemo {
	public static void main(String[] args) {
		int arr1[] = new int[4];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		int length = arr1.length;
		int arr2[] = new int[4];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		arr2[3] = 40;
		int arr3[] = new int[4];
		arr3[0] = 100;
		arr3[1] = 200;
		arr3[2] = 300;
		arr3[3] = 400;
		System.out.println("Using for loop");
		for (int i = 0; i < length; i++) {
			System.out.println(arr1[i] + " ");
		}

		System.out.println("Using while loop");
		int i = 0;
		while (i < length) {
			System.out.println(arr2[i]);
			i++;
		}

		System.out.println("Using for each loop");
		for (int j : arr3) {
			System.out.println(j);
		}

	}
}
