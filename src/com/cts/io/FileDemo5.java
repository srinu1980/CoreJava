package com.cts.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FileDemo5 {

	public static void main(String[] args) throws Exception 
	{

		int empId;
		String empName;
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter EmployId :");
		empId=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Employname :");
		empName=br.readLine();
		
		
		System.out.println(empId+"           "+empName);
		
		
	}

}
