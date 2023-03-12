package com.springcore.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DynamicQueries {
	public static void main(String args[])
	  {
		  
		  try {//load driver
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  //Create connection
			  String url= "jdbc:mysql://localhost:3306/newdb";
			  String username= "root";
			  String password= "root";
			  Connection con = DriverManager.getConnection(url,username,password);
			 //Create query
			   String query= "insert into C_MP_MSTR_PFL(tName,tCity) values(?,?)" ;
			   
			   PreparedStatement stmt= con.prepareStatement(query);
			   stmt.setString(1, "John ");
			   stmt.setString(2, "WashingTon");
			   stmt.executeUpdate();
			   System.out.println("Values inserted in db....");
			   
			   con.close();			  
		  }
		  
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		 
	  }
}
