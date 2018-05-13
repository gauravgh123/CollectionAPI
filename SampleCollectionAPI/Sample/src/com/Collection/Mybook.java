package com.Collection;
import java.util.*;
public class Mybook implements Comparable<Mybook> {
 
	int bookID;
	String booknm;
	String bookpub;
	String bookauth;
	public Mybook(int bookID, String booknm, String bookpub, String bookauth) {

		this.bookID = bookID;
		this.booknm = booknm;
		this.bookpub = bookpub;
		this.bookauth = bookauth;
	}
	@Override
	public int compareTo(Mybook o) {
		// TODO Auto-generated method stub
		if(bookID>o.bookID) {
			return 1;
		}
		else if(bookID<o.bookID) {
			return -1;
		}
		else {
		return 0;
		}
	}
	
	
	
	
}
