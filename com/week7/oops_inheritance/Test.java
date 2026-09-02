package com.week7.oops_inheritance;

public class Test {

	public static void main(String[] args) {
		System.out.println("child referece and child object");
		BMW obj = new BMW();
		Audi audiObj = new Audi();
		obj.autoEngine();
		obj.start();
		obj.refule();
		obj.stop();
		audiObj.start();
		audiObj.refule();
		System.out.println("parent referece and parent object");
		Car c1 = new Car();
		c1.start();
		c1.refule();
		c1.stop();
		
		System.out.println("parent referece and child object");
		Car c2 = new BMW();
		c2.start();
		c2.refule();
		c2.start();

		
	 
	}

}
