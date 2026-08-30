package com.week7.oops_encapsulation;

public class AmazonLoginPage {
	public static void main(String[] args) {

		LoginPage user1 = new LoginPage();
		user1.setUsername("Aditya");
		user1.setPassword("aditya123@123");
		user1.doLogin(user1.getUsername(), user1.getPassword());
		
		System.out.println("************************");
		
		LoginPage user2 = new LoginPage();
		user2.setUsername("Samiksha");
		user2.setPassword("s@123@123");
		user2.doLogin(user2.getUsername(), user2.getPassword());
		
	}
}
