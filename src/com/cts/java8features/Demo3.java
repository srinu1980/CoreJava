package com.cts.java8features;

//Example for Method reference to an instance method of an object
interface MyInterface
{
	
	void display();
}
public class Demo3 {

	public void myMethod()
	{
		System.out.println("Instance method");
	}
	
	public static void main(String[] args) 
	{

Demo3 ob=new Demo3();

//method reference using the object of the class
MyInterface ref=ob::myMethod;

ref.display();

	}

}
