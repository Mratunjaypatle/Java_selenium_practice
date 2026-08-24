package com.week5;

public class ThisKeyword {

    // Instance variables
    // These variables belong to the EmployeeData object.
    int id;
    String name;

    // Constructor
    // The constructor is called automatically when an object is created.
    public ThisKeyword(int id, String name) {

        this.id = id;

        /*
         * 'this.name' refers to the current object's
         * instance variable 'name'.
         *
         * 'name' refers to the constructor parameter.
         */
        this.name = name;

        System.out.println("Constructor calling");

        // Accessing instance variables using 'this'
        System.out.println("Employee ID   : " + this.id);
        System.out.println("Employee Name : " + this.name);
    }

    // Method
    public void show() {

        System.out.println("Method calling");

        /*
         * We can access instance variables directly
         * inside a non-static method.
         *
         * Java internally understands:
         * id   -> this.id
         * name -> this.name
         */
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
    }
      public void message1()
      {
    	  System.out.println("message 1");
    	  this.message2();
      }
      public void message2()
      {
    	  System.out.println("message 2");
      }
    // Main method - program execution starts from here
    public static void main(String[] args) {

        /*
         * Creating an object of EmployeeData.
         *
         * new EmployeeData(101, "Aman")
         * calls the constructor.
         */
        ThisKeyword obj = new ThisKeyword(101, "Aman");

        /*
         * Calling the show() method using the object.
         */
//        obj.show();
        obj.message1();
    }
}
