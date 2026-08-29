package com.week6.stringclass;

/*
 * String is the collection of characters in java. String is immutable class in
 * java. ways to declare -> using literal literal -> Object will create inside
 * SCP (String constant Pool) using new keyword -> 2 object will create for same
 * string.
 */

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "Hello All!";
		// length() => capture length of string
		System.out.println("Total length of s1 is " + s1.length());

		// to convert string into toUpperCase() or toLowerCase()
		System.out.println("String in lower case " + s1.toLowerCase());
		System.out.println("String in upper case " + s1.toUpperCase());

		/*
		 * equality between Strings : equals() : case sensitive equalsIgnoreCase() : non
		 * case sensitive
		 */
		String actual = "Selenium Webdriver is WebUI Automation Library";
		String expected = "Selenium Webdriver is WebUI Automation library";

		System.out.println(actual.equals(expected)); // false
		System.out.println(actual.equalsIgnoreCase(expected)); // true

		// searching specific string - contains()
		System.out.println("Is actual string have Selnium ? " + actual.contains("Selenium"));
		System.out.println("Is actual string have TestNG ? " + actual.contains("TestNG"));

		String str = "Indore is in India not in Indonasia";
		System.out.println("Is indore in this sentence ?" + str.contains("Indore"));

		// prefix : startsWith() suffix : endsWith()
		System.out.println("Is actual string start with Selnium ? " + actual.startsWith("Selenium"));
		System.out.println("Is actual string start with Sele ? " + actual.startsWith("Sele"));
		System.out.println("Is actual string start with nium ? " + actual.startsWith("nium"));

		System.out.println("Actual string ends with Library?" + actual.endsWith("Library"));
		System.out.println("Actual string ends with rary?" + actual.endsWith("rary"));
		System.out.println("Actual string ends with y?" + actual.endsWith("y"));
		System.out.println("Actual string ends with lib?" + actual.endsWith("lib"));

		// concat() and using + operator

		String s2 = "Hello";
		String s3 = "world";
		System.out.println(s2.concat(" " + s3));
		System.out.println(s2 + " " + s3);

		// trim() -> ignore white spaces from the beginning and ending not in middle of
		// string

		String s4 = "          This is an example of trim()...";
		System.out.println(s4);
		System.out.println(s4.trim());

		String s5 = " ";
		System.out.println("Is String empty ? " + s5.isEmpty()); // containing space
		System.out.println("Is String blank ? " + s5.isBlank());

		// charAt -> return character based on index
		String s6 = "webtesting";
		System.out.println("charcter at 4th index " + s6.charAt(4));

		// indexOf() : It return index of first occurrence of character
		System.out.println("index of first occurence character of b " + s6.indexOf('b'));
		System.out.println(s6.indexOf('m'));
		System.out.println("index of last occurence character of e " + s6.lastIndexOf('e'));
		// return last index
		// position for
		// character
		if (s6.indexOf('o') != -1) {
			System.out.println("yes o is in string");
		} else {
			System.out.println("0 is not in string");
		}

		// substring()

		String test = "TestNG is unit testing test framework";
		System.out.println(test.substring(5));
		System.out.println(test.substring(0, 6));

//		replace()
		System.out.println(test.replace('i', '*'));
		String blindMessage = "Dog abuse";
		System.out.println(blindMessage.replace("Dog", "***"));

		// split(regular expression) : pattern

		String tools = " Selenium , Playwright , Jenkins , Postman , Cypress";
		System.out.println(tools);

		String arr[] = tools.split(",");

		for (String i : arr) {
			System.out.println(i);
		}
		System.out.println("---------------------");
		String apiTestingTool = tools.split(",")[3];
		System.out.println("API  testing tool -> " + apiTestingTool);

		String date = "August 2026";
		String month = date.split(" ")[0];
		String year = date.split(" ")[1];
		System.out.println("Month is " + month);
		System.out.println("Year is " + year);

		// toCharArray() : convert string into character array
		String s7 = "Hello this is testing automatio practice classes in java...";
		char ar[] = s7.toCharArray();
		for (char i : ar) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	 
	}
}
