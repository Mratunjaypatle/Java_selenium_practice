package com.week5.thiskeywordandconstructor;

import java.lang.module.ModuleDescriptor.Builder;

//this can be used to return the current class instance from the method..

// method -> object

public class BuilderPattern {

	public BuilderPattern startborwser() {
		System.out.println("Starting the browser");
		return this; // we are returning current class instance / object 
	}

	public void launchapplication() {
		System.out.println("Launching the application");
	}

	public void stopbrowser() {
		System.out.println("Stoping the browser");
	}

	public static void main(String[] args) {
       BuilderPattern obj = new BuilderPattern();
       obj.startborwser().launchapplication();
	}
}
