package com.cts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//To retrove recprds

public class Jdbc3 {

	public static void main(String[] args) {

		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "admin123");
			
			Statement stm=con.createStatement();
			
			ResultSet rs=stm.executeQuery("select * from emp where job='ANALYST'");
			
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"   "+rs.getString(3));
			}
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
