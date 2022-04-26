package com.cts.java8features;

import java.util.ArrayList;

public class LambaDemo2 
{

	public static void main(String[] args) 
	{

		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Anil");
		list.add("Bhavani");
		list.add("Chetan");
		list.add("Darwin");
		list.add("Mahesh");
		list.add("Sam");
	/*	
		list.forEach(
				
				     (names) ->System.out.println(names)
				
				);
		*/
		
	/*	
		long count=list.stream().filter(str->str.length()<6).count();
		
		System.out.println(count);
		*/
		
		
		list.stream().filter(str->str.length()>=6).forEach(System.out::println);
		
	}

}
