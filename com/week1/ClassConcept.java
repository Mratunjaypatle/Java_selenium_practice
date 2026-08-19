package com.week1;

public class ClassConcept {

	 String car;
	 String variant;
	 
   public void show(String car , String variant)
	 {
		 System.out.println(car);
		 System.out.println(variant);
		 System.setProperties(null);
	 }
    
   public static void main(String[] args) {
	ClassConcept c1 = new ClassConcept();
	c1.show("Nexon" , "EV");
}
	
	
	
}
