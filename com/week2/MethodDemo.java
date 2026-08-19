package com.week2;

public class MethodDemo {

	public static void show() {
		System.out.println("This is static method");
	}

	public void display(String str , int id) {
		System.out.println("This is instance method");
		System.out.println("Name is " + str + "\nId is " + id);
	}
	 
   public static void add(int a,int b)
   {
		 
	   System.out.println(a+b);
   }
	public static void main(String[] args) {
		MethodDemo m1 = new MethodDemo();
		MethodDemo.show();
		 show();
		m1.display("Yash" , 101);
	}  

}
