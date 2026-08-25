package com.week5.thiskeywordandconstructor;

import java.util.Scanner;

public class ConstructorTask {

	String firstname;
	String lastname;
	char gender;
	String address;
	int mobile_num;

	public ConstructorTask(String firstname, String lastname, char gender, String address, int mobile_num) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.address = address;
		this.mobile_num = mobile_num;

	}

	public void show() {
		System.out.println("First name is -> " + firstname);
		System.out.println("Last name is -> " + lastname);
		System.out.println("Address is -> " + address);
		System.out.println("Mobile Number is -> " + mobile_num);
		if (gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F') {
			System.out.println("Gender is -> " + gender);
		}else
		{
			System.out.println("Gender is invalid");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name : ");
		String firstname = sc.next();
		System.out.println("Enter the last name : ");
		String lastname = sc.next(); 
		System.out.println("Enter the gender (M / F) : ");
		char gender = sc.next().charAt(0);
		System.out.println("Enter the address name : ");
		String address = sc.next();
		System.out.println("Enter the mobile number : ");
		int mobile_num = sc.nextInt();
		ConstructorTask obj = new ConstructorTask(firstname, lastname, gender, address, mobile_num);

		obj.show();
		sc.close();

	}

}
