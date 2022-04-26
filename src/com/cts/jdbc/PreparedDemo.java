package com.cts.jdbc;

//To modify record using preparedStatement
import java.sql.*;
import java.util.*;

//To retrive records using ResultSet

public class PreparedDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "admin123");

																					
			PreparedStatement ps=con.prepareStatement("select *from user  where username=? and password=?");
			
			ResultSet rs=ps.executeQuery();

			if(rs.next())
			{
				//redirect to which
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
