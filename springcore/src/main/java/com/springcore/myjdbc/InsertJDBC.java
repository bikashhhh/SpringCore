package com.springcore.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJDBC {
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
			   String query= "Create table C_MP_MSTR_PFL(tid int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))" ;
			   
			   Statement stmt= con.createStatement();
			   stmt.executeUpdate(query);
			   System.out.println("Table Created in db....");
			   
			   con.close();			  
		  }
		  
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		 
	  }

}
