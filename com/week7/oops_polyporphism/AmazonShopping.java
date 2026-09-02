package com.week7.oops_polyporphism;

public class AmazonShopping {
	public void search(String product) {
		System.out.println("Product is " + product);
	}

	public void search(int price, String product) {
		System.out.println("Product is " + product + " and the price of pdocut is " + price);
	}

	public void search(int price) {
		System.out.println("Price is " + price);
	}

	public void search(String product, int price) {
		System.out.println("The price is " + price + " of " + product);
	}

}
