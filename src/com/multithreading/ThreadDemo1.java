package com.multithreading;

//Thread class methods
public class ThreadDemo1 {
	public static void main(String[] args) {

		//Thread t=new Thread();
		Thread t=Thread.currentThread();
		System.out.println("Current Thread is  :"+t); //Thread=0 5 main
		
		System.out.println("Thread  Name :"+t.getName());
		System.out.println("Thread Priority :"+t.getPriority());
		
		t.setPriority(8);
		t.setName("Cts");
		
		System.out.println("Current Thread properties :"+t);
		
		System.out.println("Minimum priority for Thread is  :"+t.MIN_PRIORITY);

		System.out.println("Normal priority for Thread is  :"+t.NORM_PRIORITY);

		System.out.println("Minimum priority for Thread is  :"+t.MAX_PRIORITY);
		
		
	}

}
