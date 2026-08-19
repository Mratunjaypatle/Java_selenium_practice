package com.week2;

public class StaticBlockDemo {

	static String dogName = "Tommy";
	static 
	{
		System.out.println("Static block is calling " + dogName);
	}
	public static void main(String[] args) {
		System.out.println("Main() is calling " + dogName);
	}
}
