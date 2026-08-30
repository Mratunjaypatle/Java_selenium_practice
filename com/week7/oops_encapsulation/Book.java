package com.week7.oops_encapsulation;

public class Book {

	private int pageNo;

	public void setPageNo(int pageNo) {
		if (pageNo > 0 && pageNo <= 300) {
			System.out.println("Book for page no. " + pageNo + " is available..");
			this.pageNo = pageNo;
		} else {
			System.out.println("Book is not found for " + pageNo);
		}
	}

	public int getPageNo() {
		return pageNo;
	}

}
