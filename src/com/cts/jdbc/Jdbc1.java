package com.cts.jdbc;

import java.sql.*;
public class Jdbc1 
{

	public static void main(String[] args) 
	{

		try
		{
		
			//Step -1  To register the JDBC Drivers for Oracle
			//Class.forName("oracle.jdbc.driver.OracleDriver");  
			
			
			//To register the Jdbc Drivers for MySql
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//Step-2 To connect Oracle Database using DriverManagerClass
			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "admin123");
			
			
			//Step -3 To create Statement
			Statement stm=con.createStatement();
			
			
			//Step 4 to execute sql queries
			
			String query="insert into emp values(200,'Surya','Analyst',40000)";
			
			int x=stm.executeUpdate(query);
			
			//Step 5 To print statement
			
			System.out.println(x+" Record(s) Inserted Successfully.....");
			
			
			//Step 6 to close database
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e);
		}

	}

}
