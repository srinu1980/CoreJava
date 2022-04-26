package com.cts.io;

import java.io.*;
public class FileDemo3 
{

	public static void main(String[] args) 
	{

		try
		{
			FileReader fr=new FileReader("newFile.txt");
			int i;
			while(((i=fr.read())!=-1))
			{
				System.out.print((char)i);
				Thread.sleep(500);
			}
			
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
