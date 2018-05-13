package com.Factory.pattern;

public class Factory {

	public OS getInstance(String str) {
		if(str.equals("Open"))
			return new Android();
		else if(str.equals("Secured"))
			return new IOS();
		else 
			return new Windows();
	}

}
