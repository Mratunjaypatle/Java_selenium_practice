package com.week7.oops_encapsulation;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
//		b1.setPageNo(102);
//		System.out.println(b1.getPageNo());
		b1.setPageNo(-90);
		System.out.println(b1.getPageNo());
	}

}
