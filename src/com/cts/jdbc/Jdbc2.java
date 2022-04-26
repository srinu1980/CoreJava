package com.cts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc2 {

	public static void main(String[] args) {


		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "admin123");
			
			Statement stm=con.createStatement();
			

			String query="create table Emp2022 (empno int,ename varchar(20), job varchar(15))";
			
			//String query="update emp set job='MANAGER', salary=42300 where empid=200";
			
			stm.executeUpdate(query);
			
			System.out.println(" Table created Successfully.....");
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e);
		}

		
	}

}
