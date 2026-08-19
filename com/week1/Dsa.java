package com.week1;
import java.util.Arrays;
public class Dsa {

	public static int Max(int [] a){
		Arrays.sort(a);
		int min = a[0];
		int max = a[a.length-2];
		System.out.println(min);
		System.out.println(max);
		return 0;
	}
	
	public static void main(String[] args) {
		int a[] = { 1, 6, 3, 7, 8, 4 };
		Max(a);

	}

}
