package com.cts.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		try
		{
			
			StudentInfo student=new StudentInfo(100, "Rahul","9234550670");
			FileOutputStream fos=new FileOutputStream("student.ser");
			
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(student);
			
			System.out.println("Serialization is completed......");
			
			oos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
