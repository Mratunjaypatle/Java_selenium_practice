package com.week3;
import java.util.Random;


public class AccessModifier {

	int id = 101; // default
	public String name = "Satyam"; // public
	private int phone_num = 881566370; // private

	public static void main(String[] args) {

		AccessModifier a1 = new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phone_num);

		Random r1 = new Random();
		int num = r1.nextInt(10);
		System.out.println(num);
		
	
	}
}
