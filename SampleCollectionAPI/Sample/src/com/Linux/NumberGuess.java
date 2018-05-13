package com.Linux;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
	/*//comment line
		//\u000d 
		System.out.println("Comment executed");
		*/
		///////////////////////////////////
		/*loop1:
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++){
				if(i==3) 
					break loop1;
					System.out.println("i = " + i + " j = " + j);
				
			}
		}*/
		////////////////////////////////
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss ");
		LocalDateTime now=LocalDateTime.now();
		System.out.println(dtf.format(now));
				}

}
