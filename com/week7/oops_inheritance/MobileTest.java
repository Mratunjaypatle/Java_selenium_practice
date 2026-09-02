package com.week7.oops_inheritance;

public class MobileTest {

	public static void main(String[] args) {
		
	 Iphone obj = new Iphone();
	 obj.message("Hello , how are you ... 💕💕");
	 obj.CameraQuality();
	 obj.voiceNote("i am busy right now , i will call back uhh later");
	 obj.calling("hyee , i am not able to listen uhh please share your voice note");

	 System.err.println("Data from nothing class");
	 Nothing obj2 = new Nothing();
	 obj2.calling("hyee dear , nice to talk with uhhh.....");
	 obj2.voiceNote("call back uhh shortly..");
	 obj2.message("Hello , glad to see uhh today..💗")
	}

}
