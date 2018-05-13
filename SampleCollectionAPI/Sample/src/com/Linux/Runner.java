package com.Linux;

import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list=new LinkedList();
		list.add(18); 
		list.add(69);
		list.add(21);
		list.add(55);
		
		list.size();
		System.out.println(list.size());
		System.out.println(System.out);
		/*list.add(5);
		list.add(3,12);
		list.size();*/
		
		list.forEach((temp)->{
		System.out.println("\t"+temp);	
		});
		
	}
}
