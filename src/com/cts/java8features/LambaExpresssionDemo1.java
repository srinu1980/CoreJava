package com.cts.java8features;

@FunctionalInterface
interface Demo
{
	public void display(); //SAM
	
}

public class LambaExpresssionDemo1 {

	public static void main(String[] args) 
	{
		int x=100;
		Demo d=() ->{
			System.out.println("Welcome to Display method using Lamba Expression");
			System.out.println(x);
			};
		
		
		d.display();
		
	}

}
