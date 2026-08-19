package com.week2;

public class DataTypes {
    //Primitive Data Types
	// boolean 1bit => True , False
	public static void main(String[] args) {
		
		boolean status = true;
		System.out.println("Internet Status is " + status);
		status = false;
		System.out.println("Update Internet Status is " + status);
		System.err.println("************************************");
		boolean newStatus = false;
		System.out.println("New Internet Status is " + newStatus);
		newStatus = false;
		System.out.println("New Update Internet Status is " + newStatus);
		System.err.println("************************************");
		
		char ch = 'a';
		System.out.println("Your character is " + ch);
		char newChar = '+';
		System.out.println("Your character is " + newChar);
		char n = 32;
		System.out.println(n + "b");
		System.err.println("************************************");
		
		
		// byte-->short->int(default)-->long

//		byte 1byte -128 to 127
		
		byte num= 127;
		byte num2 = -128;
		System.out.println("Byte number is "+num);
		System.out.println("Byte number is "+num2);
		System.err.println("************************************");
//		short 1short -32768 to 32767
//		short num3 = 32769;  cannot convert from int to short 
		short num3 = 32766;
		short num4 = 326;
		System.out.println("short number is " + num3);
		System.out.println("short number is " + num4);
		
		System.err.println("************************************");
		int a = 999999999;
		System.out.println("int number is " + a);
    
		long ab = 9999999990l;
		System.out.println("long number is "+ab);
	
		//float 4byte double 8byte (default)
		float f1 = 3.14f;
		System.out.println("Floating number is " + f1);
		double f2 = 3.14159265359;
		System.out.println("Double number is " + f2);
		
	}
	
	

}
