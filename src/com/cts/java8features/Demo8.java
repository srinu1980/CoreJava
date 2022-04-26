package com.cts.java8features;

//default & static  methods in interface

interface MyInterf
{
	default void newMethod()
	{
		System.out.println("Newlly added default method");
	}
	
	static void anotherNewMethod()
	{
		System.out.println("Newly added static method");
	}
	void existingMethod(String str);
	
}
public class Demo8 implements MyInterf 
{
	@Override
	public void existingMethod(String str) {
	
	System.out.println("String is :"+str);	
	}
	
	public static void main(String[] args) 
	{

		Demo8 obj=new Demo8();
		
		obj.newMethod();
		
		obj.existingMethod("Welcome to Cognizant");
		
		
		MyInterf.anotherNewMethod();
	}

	

}
