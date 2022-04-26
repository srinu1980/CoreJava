package com.multithreading;

//Example for Runnable interface

public class ThreadDemo2 implements Runnable 
{
	
	public void run()
	{
		try
		{
		System.out.println("Thread is running........");
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child process i ="+i);
			Thread.sleep(1000);
		}
		
		}
		catch(InterruptedException e) {}
	}
	
	public static void main(String[] args) 
	{

		ThreadDemo2 ob=new ThreadDemo2();
		
		Thread t=new Thread(ob);
		
		t.start(); //its calling run method
		
		try
		{
		
		for(int i=5;i>=1;i--)
		{
			System.out.println("Main process i ="+i);
			Thread.sleep(500);
		}
		
		}
		catch(InterruptedException e) {}
		

	}

}
