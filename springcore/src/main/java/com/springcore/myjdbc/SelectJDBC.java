package com.springcore.myjdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class SelectJDBC {
	public static void main(String args[])
	  {
		  
		  try {//load driver
			 // Class.forName("com.mysql.cj.jdbc.Driver");
			  //Create connection
			  String url= "jdbc:mysql://localhost:3306/newdb";
			  String username= "root";
			  String password= "root";
			  Connection con = DriverManager.getConnection(url,username,password);
			 //Create query
			   String query= "select * from C_MP_MSTR_PFL" ;
			   
			   Statement stmt= con.createStatement();
			   
			  ResultSet set =stmt.executeQuery(query);
			   System.out.println("Values picked from db....");
			   while(set.next())
			   {
				   int id= set.getInt(1);
				   String name= set.getString(2);
				   String city = set.getString(3);
				   
				   System.out.println("Id: "+ id + "," +" name: "+name +","+ " city: "+city);
			   }
			   
			   con.close();			  
		  }
		  
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }


}
