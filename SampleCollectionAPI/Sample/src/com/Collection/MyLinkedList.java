package com.Collection;

import java.util.*;
public class MyLinkedList {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<Book> list=new LinkedList<Book>();  
    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
    Book b4=new Book(104,"Linux","Harshada","Seth",24);
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    list.add(b4);
    //Traversing list  
    for(Book b:list){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    } 
    
    System.out.println(list.size());
}  
}  