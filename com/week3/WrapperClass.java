package com.week3;


public class WrapperClass {

	public static void main(String[] args) {
		//primitive to object -> Autoboxing..
		int x = 100;
		Integer i1 = Integer.valueOf(x);
		
		System.out.println("Primitive data " + x);
		System.out.println("Primitive to object " + i1);
		
		char ch = 'A';
		Character c1 = Character.valueOf(ch);
		System.out.println("Primitive data " + c1);
		System.out.println("Primitive to object " + c1);
		
	   /* String s = "Hello";
	    int i = s.hashCode();
	    System.out.println("THe hashcode of string is " + i);*/
  
//		Object to primitive -> Unboxing
	    Integer i = 200; // object
	    int i2 = i.intValue(); 
	    System.out.println("Object to primitive " + i2);
	    
	    Character ch1 = 'B';
	    char ch2 = ch1.charValue();
	    System.out.println(ch2);
	    
	    String str = "1234";
	    int strnum = Integer.parseInt(str);
	    System.out.println(strnum);
	    
	    String billMsg = "Current bank balance is 50000";
	    String billMsgAmount = billMsg.split(" ")[4];
	    int amount = Integer.parseInt(billMsgAmount);
	    if(amount == 50000)
	    {
	    	System.out.println("Test is pass : My bank amount is => " + amount);
	    }
		
	    
	}
}
