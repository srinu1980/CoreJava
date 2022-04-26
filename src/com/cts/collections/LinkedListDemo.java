package com.cts.collections;
import java.util.*;

class Product
{
	private int productId;
	private String productName;
	private double price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
}

public class LinkedListDemo {

	public static void main(String[] args) 
	{

		Product p1=new Product(100,"Laptop",80000);
		Product p2=new Product(200,"Mobile",10000);
		Product p3=new Product(300,"Keyboard",2000);
		Product p4=new Product(400,"Mourse",1000);
		
		
		LinkedList<Product>li=new LinkedList<>();
	
		li.add(p1);
		li.add(p2);
		li.add(p3);
		li.add(p4);
		
		System.out.println("LinkedList elements using for loop");
		
		for(int i=1;i<li.size();i++)
		{
			Product p=li.get(i);
			System.out.println(p.getProductId()+"  "+p.getProductName());
		}
		
		Iterator<Product> i=li.iterator();

		System.out.println("LinkedList elements using Iterator ");
		
		while(i.hasNext())
		{
			Product p=i.next();
			System.out.println(p.getProductId()+"   "+p.getProductName());
		}
	}

}
