package connection;

import java.sql.*;
import java.io.*;

public class DataCon 
{
  Connection con;
  
 public Connection getConnection1()
{
   try
 {
 Class.forName("oracle.jdbc.driver.OracleDriver");
 con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","deepak", "abc123");
       System.out.println("Connection connet Sucessfully");
}
catch(Exception e)
{
   e.toString();
}
return con;

}
public void close(Connection con)
	{
	  try{
		   con.close();
	  }catch(Exception e1)
		{}
	}
}