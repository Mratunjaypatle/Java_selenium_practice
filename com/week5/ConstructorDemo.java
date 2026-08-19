package com.week5;

public class ConstructorDemo {

	// INSTANCE VARIABLES

	int id;
	String name;

	// DEFAULT CONSTRUCTOR
	/*
	 * A constructor with no parameters is called a Default/No-Argument Constructor.
	 *
	 * It is used to initialize an object with default values.
	 *
	 * For int, the default value is 0. For String (reference type), the default
	 * value is null.
	 */
	public ConstructorDemo() {

		System.out.println("Default constructor is calling -> ");

		System.out.println("ID   : " + id);
		System.out.println("Name : " + name);
	}

	// PARAMETERIZED CONSTRUCTOR
	/*
	 * A constructor that accepts parameters is called a Parameterized Constructor.
	 *
	 * Here: i -> local variable / parameter str -> local variable / parameter
	 *
	 * The values received through the constructor parameters are assigned to the
	 * instance variables of the object.
	 */
	public ConstructorDemo(int i, String str) {

		// Assigning local/parameter values to instance variables
		id = i;
		name = str;

		System.out.println("Parameterized constructor is calling -> ");

		System.out.println("ID   : " + id);
		System.out.println("Name : " + name);
	}

	public static void main(String[] args) {

		/*
		 * Object creation:
		 *
		 * When an object is created using the 'new' keyword, the constructor is
		 * automatically called.
		 */

		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo(101, "Mratunjay Patle");
	}
}

/*
 * ============================================================ CONSTRUCTOR
 * NOTES ============================================================
 *
 * 1. WHAT IS A CONSTRUCTOR?
 * ------------------------------------------------------------ A constructor is
 * a special member of a class that is used to initialize an object when the
 * object is created.
 *
 *
 * 2. CONSTRUCTOR NAME
 * ------------------------------------------------------------ The constructor
 * name must be exactly the same as the class name.
 *
 * Example:
 *
 * class Student {
 *
 * Student() { // Constructor } }
 *
 *
 * 3. RETURN TYPE ------------------------------------------------------------ A
 * constructor does NOT have any return type.
 *
 * Not even 'void' should be written before a constructor.
 *
 * Correct: Student() { }
 *
 * Incorrect: void Student() { }
 *
 * If we write 'void', it becomes a method, not a constructor.
 *
 *
 * 4. WHEN IS A CONSTRUCTOR CALLED?
 * ------------------------------------------------------------ A constructor is
 * automatically invoked when an object is created using the 'new' keyword.
 *
 * Example:
 *
 * Student s = new Student();
 *
 * Here, Student() is automatically called.
 *
 *
 * 5. PURPOSE OF A CONSTRUCTOR
 * ------------------------------------------------------------ The main purpose
 * of a constructor is to initialize the object.
 *
 * Example:
 *
 * Student s = new Student(101, "Rahul");
 *
 * The constructor can initialize:
 *
 * id = 101 name = "Rahul"
 *
 *
 * 6. TYPES OF CONSTRUCTORS
 * ------------------------------------------------------------
 *
 * A. No-Argument / Default Constructor
 *
 * Student() { }
 *
 * B. Parameterized Constructor
 *
 * Student(int id, String name) { }
 *
 *
 * 7. DEFAULT VALUES OF INSTANCE VARIABLES
 * ------------------------------------------------------------ If instance
 * variables are not explicitly initialized, Java provides default values.
 *
 * int -> 0 long -> 0L float -> 0.0f double -> 0.0d boolean -> false char ->
 * '\u0000' String -> null Object -> null
 *
 *
 * 8. CONSTRUCTOR OVERLOADING
 * ------------------------------------------------------------ Constructor
 * overloading is possible.
 *
 * A class can have multiple constructors with different parameter lists.
 *
 * Example:
 *
 * Student() { }
 *
 * Student(int id) { }
 *
 * Student(int id, String name) { }
 *
 * This is called Constructor Overloading.
 *
 *
 * 9. CONSTRUCTOR OVERRIDING
 * ------------------------------------------------------------ Constructor
 * overriding is NOT possible.
 *
 * Constructors are not inherited by child classes, so they cannot be
 * overridden.
 *
 *
 * 10. STATIC CONSTRUCTOR
 * ------------------------------------------------------------ Constructors
 * cannot be declared as static.
 *
 * Reason: A static member belongs to the class, whereas a constructor is
 * associated with object creation.
 *
 *
 * 11. FINAL CONSTRUCTOR
 * ------------------------------------------------------------ Constructors
 * cannot be declared as final.
 *
 * The 'final' keyword is related to preventing method overriding, but
 * constructors cannot be overridden in the first place.
 *
 *
 * 12. ABSTRACT CONSTRUCTOR
 * ------------------------------------------------------------ Constructors
 * cannot be declared as abstract.
 *
 * An abstract method has no implementation and is meant to be overridden by a
 * child class. Constructors cannot be overridden.
 *
 *
 * 13. CONSTRUCTOR AND 'this' KEYWORD
 * ------------------------------------------------------------ The 'this'
 * keyword refers to the current object.
 *
 * It is commonly used when constructor parameters and instance variables have
 * the same name.
 *
 * Example:
 *
 * ConstructorDemo(int id, String name) { this.id = id; this.name = name; }
 *
 * Here: this.id -> instance variable id -> constructor parameter
 *
 *
 * 14. IMPORTANT DIFFERENCE: CONSTRUCTOR vs METHOD
 * ------------------------------------------------------------
 *
 * Constructor: - Same name as class - No return type - Called during object
 * creation - Used to initialize objects - Cannot be overridden
 *
 * Method: - Can have any valid name - Must have a return type or void - Called
 * explicitly - Used to perform an operation/behavior - Can be overridden
 *
 *
 * 15. IMPORTANT POINT ABOUT DEFAULT CONSTRUCTOR
 * ------------------------------------------------------------ If we do NOT
 * write any constructor in a class, Java compiler automatically provides a
 * no-argument constructor.
 *
 * However, if we write at least one constructor ourselves, Java does NOT
 * automatically provide another default constructor.
 *
 * Example:
 *
 * class Student {
 *
 * Student(int id) { } }
 *
 * Student s = new Student();
 *
 * This will give a compilation error because Student() was not automatically
 * created by the compiler.
 *
 *
 * 16. QUICK SUMMARY
 * ------------------------------------------------------------
 *
 * Constructor = Special member used for object initialization.
 *
 * Rules:
 *
 * - Same name as class - No return type - Automatically called during object
 * creation - Constructor overloading is possible - Constructor overriding is
 * not possible - Cannot be static - Cannot be final - Cannot be abstract - Can
 * have parameters - Can initialize instance variables
 *
 * ============================================================
 */