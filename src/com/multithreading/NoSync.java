package com.multithreading;

class Account
{
	
	private int money;
	
	public Account(int amt)
	{
		this.money=amt;
	}
	
	
	synchronized void withdraw(int amt) //syncronized method
	{
		if(amt<money)
		{
			try
			{
				Thread.sleep(1000);
				money=money-amt;
			}
			catch(Exception e) {}
			System.out.println("Received  "+amt+"  by  "+Thread.currentThread().getName());
		}
		else
		{
			System.out.println("Sorry  "+Thread.currentThread().getName()+"   Requested amt ("+amt+" ) is not available.");
		}
		System.out.println(" Balance  :"+money);
	}
}


public class NoSync implements Runnable 
{

	
	Account a;
	int amt;
	
	public static void main(String[] args) 
	{

		Account acc=new Account(1000);
		new NoSync(acc,"A",500);
		new NoSync(acc,"B",750);
	}

	public NoSync(Account a, String name, int amt)
	{
		this.a=a;
		this.amt=amt;
		new Thread(this,name).start();
	}
	
	public void run()
	{
	
		//synchronized (a) {
			
			a.withdraw(amt);
	//	}
				
		
		
	}
}
