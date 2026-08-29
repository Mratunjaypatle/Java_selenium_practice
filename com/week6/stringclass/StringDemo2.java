package com.week6.stringclass;

import java.nio.file.spi.FileSystemProvider;

public class StringDemo2 {
	public static void main(String[] args) {
		/*
		 * There is two classes in java base on String concept StringBuffer class (java
		 * v1.1) & StringBuilder classes ( java v1.5) These classes are mutable
		 * -StringBuffer is synchronize (at a time only one thread) -StringBuider is non
		 * synchronize (at a time multiple thread)
		 * 
		 * reverse the string
		 */

		StringBuilder b = new StringBuilder("hello ");
		b.append(2026); // append integer after string..
		System.out.println(b);

		// how to reverse the string -> using reverse()
		System.out.println(b.reverse());

		// How to reverse string using String class
		String str = "Hello";
		String rev = "";
//		h e l l o
//		0 1 2 3 4

		int length = str.length() - 1; // 5
		for (int i = length; i >= 0; i--) {
			rev += str.charAt(i) + " ";
		}
		System.out.print(rev );
	}
}
