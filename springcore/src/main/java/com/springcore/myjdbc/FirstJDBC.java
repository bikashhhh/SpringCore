package com.springcore.myjdbc;
import java.sql.*;

public class FirstJDBC {
  public static void main(String args[])
  {
	  try {
		  /*Loading class `com.mysql.jdbc.Driver'. This is deprecated. 
		   * The new driver class is `com.mysql.cj.jdbc.Driver'. 
		   * The driver is automatically registered via the SPI and 
		   * manual loading of the driver class is generally unnecessary.
            java.sql.SQLException:  No suitable driver found for jdbc://localhost:3306/newdb  */
		  //Class.forName("com.mysql.jdbc.Driver");
		  
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  //Create connection
		  String url= "jdbc:mysql://localhost:3306/newdb";
		  String username= "root";
		  String password= "root";
		  Connection con = DriverManager.getConnection(url,username,password);
		  // con.close();
		   if(con.isClosed()) {
			  System.out.println("Connection is closed.....");
		  }
		  else {
			  System.out.println("Connection is created....");
		  }
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
		  //System.out.println("Exception occured: "+ e.getMessage());
	  }
  }
}
