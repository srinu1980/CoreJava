package com.cts.collections;

import java.util.*;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{

		List<String> al=new ArrayList<>();
		
		System.out.println("ArrayList Size :"+al.size());
		System.out.println("ArrayList elements :"+al);
		
		al.add("A");
		al.add("Welcome");
		al.add("C");
		al.add("B");
		al.add("D");
		al.add("Z");
		
		System.out.println("ArrayList Size :"+al.size());
		System.out.println("ArrayList elements :"+al);
		
		al.remove(1);
		al.remove("Z");

		al.add(2, "Cognizant");
		System.out.println("ArrayList Size :"+al.size());
		System.out.println("ArrayList elements :"+al);
		
	}

}
