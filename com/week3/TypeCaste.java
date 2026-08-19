package com.week3;

public class TypeCaste {
	
public static void main(String[] args) {
	
	// Type Casting 
	// 1. Implicit casting -> Automatic casted by JVM from small to large 
	// in implicit byte -> short -> int -> long -> float -> double
	System.err.println("****************Implicit******************");
	int x = 99999;
	long y = x;
    System.out.println(y);
    char c1 = 'A';
    int a1 = c1;
    System.out.println(a1);
    //print the ascii value of any character 
    char ch = 'w';
    int ascii = ch;
    System.out.println("char into int conversion => " + ascii);
    int i1 = 998999999;
    float f1 = i1;
    System.out.println("int into float conversion => " + f1);
    float f2 = 837.34f;
    double d1 = f2;
    System.out.println("float into double conversion => " + d1);
	double d2 = f1;
	System.out.println(d2);

	System.err.println("****************Explicit******************");
	
	//Explicit casting -> 	
	long l1 = 9999999999999l;
	int i2 = (int)l1; 	 
	System.out.println("long into int conversion is "+i2);
	
	
	
}
}
