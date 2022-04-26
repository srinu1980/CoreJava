package com.cts.java8features;

//Method reference to a constructor

interface MyInterface2
{

	Hello display(String say);
	
}
class Hello
{
	public Hello(String say)
	{
		System.out.println(say);
	}
}
public class Demo7 {

	public static void main(String[] args) {

		MyInterface2 ref=Hello::new;
		
		ref.display("Hello Cognizant");

	}

}
