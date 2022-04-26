package com.cts.io;

import java.io.*;

//Using FileWriter class to write file contents

public class FileDemo2 {

	public static void main(String[] args) {

		try
		{
		File f=new File("newFile.txt");
		
		FileWriter fw=new FileWriter(f);	

		String msg="Welcome to learning io package. It is used to write concents permanentlly";
		
		fw.write(msg);
		
		System.out.println("File contents written successfully....");
		fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
