package com.week7.oops_inheritance;

class A {

	public void M1() {
		System.out.println("M1 is calling from A class");
	}
}

class B extends A // single level inheritance
// A is parent and B is child class
{
	public void M2() {
		System.out.println("M2 is calling from B class");
	}
}

class C extends B // Multilevel inheritance
// B is parent and C is child 
{
	public void M3() {
		System.out.println("M3 is calling from C class");
	}
}

/*
 * Hierarchical inheritance
 */

class D extends A {
	D()
	{
		System.out.println("Calling from class D");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
//       
//       a1.M1();
		System.out.println("Child class reference and child class object :-  parent+child");
		B b1 = new B();
		b1.M1(); // inherited method
		b1.M2(); // individual method
		// multilevel C --> B --> A

		C c1 = new C();
		c1.M1();// inherited
		c1.M2();// inherited
		c1.M3();// individual

		System.out.println("Parent class reference and parent class object :-  parent");
		A a1 = new A();
		a1.M1();// individual method

//
		System.out.println("Parent class reference and child class object :- parent");
		A a2 = new B();
		a2.M1();// individual method
		B b3 = new B();
		b3.M2();
		
		D d1 = new D();
		d1.M1();
//		System.out.println("Child class referece and parent class object :- parent");
//		B b2 = new A(); // we can not convert it ... 

	}
}
