package com.Builder.pattern;

public class Phone {

	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	public Phone(String os, int ram, String processor, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}
	
	public String toString() {
		
		return "Phone "+os+" Ram "+ram+" Processor "+processor+" Screen "+screenSize+" Battery "+
		battery;
	}
	
}
