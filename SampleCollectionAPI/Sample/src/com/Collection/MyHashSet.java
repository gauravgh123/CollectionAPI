package com.Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashSet<String> set=new HashSet<>();
		
		set.add("Dev");
		set.add("Dev");
		set.add("Dev");
		
		Iterator itr=set.iterator();
		
		for (String string : set) {
			System.out.println(string);
		}*/
		/*LinkedHashSet<String> lhs=new LinkedHashSet<>();
		
		lhs.add("Prathamesh");
		lhs.add("Advait");
		lhs.add("Ayansh");
		lhs.add("Prathamesh");
		//lhs.clear();
		Iterator itr=lhs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		/*TreeSet<Mybook> ts=new TreeSet<>();
		
		Mybook b=new Mybook(109,"Harry Potter","JK","Sethpub");
		Mybook b2=new Mybook(103,"Linus Torvalds","Shell Code","Dokepub");
		Mybook b3=new Mybook(106,"Walt Disney","dp","Dpub");
		ts.add("Prathamesh");
		ts.add("Advait");
		ts.add("Ayansh");
		ts.add("Nani");
		ts.add("Nana");
		
		ts.add(b);
		ts.add(b2);
		ts.add(b3);
		for (Mybook mb : ts) {
			System.out.println(mb.bookID+" "+mb.booknm+" "+mb.bookauth+" "+mb.bookpub);
		}*/
		
		/*Queue<Mybook> q=new PriorityQueue<>();
		Mybook mbk=new Mybook(131,"Java","HeadFirst","Seth");
		Mybook mbk1=new Mybook(141,"php","udemy","USA");
		Mybook mbk2=new Mybook(151,"C++","Yashvant k", "mumbai univercity");
		Mybook mbk3=new Mybook(111, "C#","Willey","Herbert");
		q.add(mbk);
		q.add(mbk1);
		q.add(mbk2);
		q.offer(mbk3);
		q.element();
		System.out.println("\n\n------------");
		for (Mybook mybook : q) {
			System.out.println(mybook.bookID+" "+mybook.booknm+" "+mybook.bookpub+" "+mybook.bookauth);
		}*/
		/*Queue<Integer> q=new PriorityQueue<>();
		q.offer(101);
		q.offer(103);
		q.offer(100);
		//q.peek();
		System.out.println(q.peek()+" \n\n\n");
		System.out.println(q.poll());
		q.poll();
		System.out.println(q.add(199));
		//System.out.println("\n"+q.poll());
		Iterator<Integer> itr=q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
	}

}
