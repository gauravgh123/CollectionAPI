package com.Builder.pattern;

public class Shop {

	public static void main(String[] args) {
		
		Phone p=new PhoneBuilder().setOs("Windows").setRam(2).setProcessor("Intel").getPhone();
		
	
		System.out.println(p);
	}

}
