package com.cts.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.concurrent.Callable;

//DeSerialization

public class DesrializationDemo {


	public static void main(String[] args) {

		try
		{
			FileInputStream fis=new FileInputStream("student.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			StudentInfo si=(StudentInfo)ois.readObject();
			
			System.out.println(si.sid);
			System.out.println(si.sname);
			System.out.println(si.contact);
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
