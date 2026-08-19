package com.week2;

import java.util.Arrays;

public class ArrayDemo {

	// largest and second largest

	public static int Largest(int[] a) {
		int largest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
		}
		return largest;
	}

	 public static int SecondLargest(int[] a) {
	        Arrays.sort(a);
	        int n = a.length;
	        // 1 2 5 6 14 50 50

	        for (int i = n - 2; i >= 0; i--) {
	            if (a[i] != a[n - 1]) {
	                return a[i];
	            }
	        }
	        return -1;
	    }

	public static void main(String[] args) {
		int a[] = { 1, 5, 4, 6, 8, 9, 17 };
		int result = Largest(a);
		System.out.println("Largest element is " + result);
		System.out.println("Second Largest element is " + SecondLargest(a));

	}
}
