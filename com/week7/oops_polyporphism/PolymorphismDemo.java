package com.week7.oops_polyporphism;

public class PolymorphismDemo {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	public void add(double a , double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		PolymorphismDemo p1 = new PolymorphismDemo();
		p1.add(19, 10);
		p1.add(19, 10 , 10);
		p1.add(12.3, 12.9);
	}

}
