package com.week6.stringclass;

public class StringDemo {
	/*
	 * String is the collection of characters in java. String is immutable class in
	 * java. ways to declare -> using literal literal -> Object will create inside
	 * SCP (String constant Pool) using new keyword -> 2 object will create for same
	 * string.
	 */
	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hello";

		/*
		 * compare ids assign by jvm using operator (==) compare data assign to string
		 * using method
		 */
		System.out.println(s1 == s2); // true
		// String is immutable
		String name1 = "Jay";
		String name2 = "Jay";

		System.out.println(name1 == name2);
		name1 = name1 + " Rathode";
		System.out.println(name1 == name2);

	}

}
