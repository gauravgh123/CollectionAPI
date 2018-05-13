package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Prathamesh");
		list.add("Advait");
		list.add("Aayansh");
		list.add("Rajendra");
		list.add("Sushant");
		list.add("Deep");
		ArrayList<String> list2=new ArrayList<>();
		list2.add("P11019");
		list2.add("P11020");
		list2.add("Sushant");
		
		list.addAll(list2);
		
		//list.retainAll(list2);
		System.out.println("Displaying the ArrayList\n");
		
		Iterator itr=list.iterator();
		
		for (String string : list) {
			System.out.println("\t"+string);
		}
	}

}
