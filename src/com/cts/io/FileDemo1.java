package com.cts.io;

import java.io.*;

public class FileDemo1 {

	public static void main(String[] args) 
	{

		try
		{
		File f=new File("newFile.txt");
		
		if(f.exists())
		{
			f.delete();
			System.out.println(f.getName()+"  deleted successfully");
		}
		else
		{
			boolean b=f.createNewFile();
			System.out.println(b);
		}
		
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
