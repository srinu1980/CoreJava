package com.cts.io;

import java.io.*;
//Copy FileContents
public class FileDemo4 {

	public static void main(String[] args) 
	{

		try
		{
			
			FileInputStream input=new FileInputStream("src/com/cts/collections/ArrayListDemo.java");
			FileOutputStream output=new FileOutputStream("Demo2.java");
			
			int i;
			while(((i=input.read())!=-1))
			{

					output.write(i);
				
			}
			
			input.close();
			output.close();
			System.out.println("File Contents copied Successfully....");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
