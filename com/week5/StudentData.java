package com.week5;

public class StudentData {

	int id;
	String name;

	public StudentData(int i, String n) {
		id = i;
		name = n;
		System.out.println("Student id -> " + id);
		System.out.println("Student name -> " + name);
	}

	
	public static void main(String[] args) {
		StudentData s1 = new StudentData(101, "aman");
		StudentData s2 = new StudentData(102, "bittu");
		StudentData s3 = new StudentData(103, "dinesh");
		StudentData s4 = new StudentData(104, "farhan");
	}

}
