package com.cts.java8features;

import java.util.Arrays;

public class Demo6 {

	public static void main(String[] args) 
	{

		String []strArray= {"Rajesh","Ramesh","Sham","Suresh","Mahesh","anil"};
		
		Arrays.sort(strArray,String::compareToIgnoreCase);
		
		
		for(String str: strArray)
		{
			System.out.println(str);
		}

	}

}
