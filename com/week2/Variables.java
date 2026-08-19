package com.week2;

public class Variables {
	
	int id = 101;
	String name = "Aditi"; // instance variable
	 String gender = "Female";
	 static String college = "IIT KANPUR";
  public void display()
  {
	  int marks = 77; // local variable
	  System.out.println("Roll number of the student is " + id);
	  System.out.println("Name of the student is " + name);
	  System.out.println("Marks of the " + name + " is "  + marks);
	  System.out.println("Gender of the student is " + gender);
	  System.out.println(college);
  }
  
  public void show()
  {
	  int marks = 98; // local variable
	  System.out.println("Marks from the show() => " + marks);
  }	
  
  public static void main(String[] args) {
 	  
	  
	  Variables v1 = new Variables();
	  System.out.println("Roll number of the student is " + v1.id);
	  System.out.println("Name of the student is " + v1.name);
	  System.out.println("Marks of student is " +  77);
	  System.out.println("collefe of student is " +  college);
	  
	 
	  v1.display();
	  MethodDemo.show();
	  MethodDemo.add(10, 20);
//	  v1.show();
	  
}
}
