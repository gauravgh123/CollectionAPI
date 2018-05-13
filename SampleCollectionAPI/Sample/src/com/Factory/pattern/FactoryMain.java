package com.Factory.pattern;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory fc=new Factory();
		OS os=fc.getInstance("");
		os.show();

	}

}
