package com.cts.collections;

import java.util.StringTokenizer;
public class StringTokenizerDemo 
{

	public static void main(String[] args) 
	{

		String book="book ID = B1010 ; Author = Patrick Naughton ; publisher = Mc Grath hills ; price = 2500.45";
		
		StringTokenizer s=new StringTokenizer(book,"=;");
		
		System.out.println("No of Tokens :"+s.countTokens());
		
		while(s.hasMoreTokens())
		{
			String key=s.nextToken();
			String val=s.nextToken();
			System.out.println(key+"   "+val);
		}
		
	}

}
