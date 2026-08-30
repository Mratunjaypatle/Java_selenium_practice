package com.week7.oops_encapsulation;

public class LoginPage {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin(String un, String passoword) {
		System.out.println("Hello " + un + " , you are successfully logged in ");

	}
}
