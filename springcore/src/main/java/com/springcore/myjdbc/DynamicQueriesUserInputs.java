package com.springcore.myjdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynamicQueriesUserInputs {
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
			   
			   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			   System.out.println("Enter name: ");
			   String name= br.readLine();
			   System.out.println("Enter City: ");
			   String city= br.readLine();
			   stmt.setString(1, name);
			   stmt.setString(2, city);
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
