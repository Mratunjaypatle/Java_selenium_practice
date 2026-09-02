package com.week7.oops_polyporphism;

public class AmazonProductTest {

	public static void main(String[] args) {
		AmazonShopping obj = new AmazonShopping();
		obj.search(70000);
		obj.search(80000, "Samsung Galaxy S25 Ultra");
		obj.search("Zara Bag");
		obj.search("Titan watch", 10000);
		
	}

}
