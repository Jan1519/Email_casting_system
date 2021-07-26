package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class GetCon {
private GetCon(){}

public static Connection con;
static{
	try {
		Class.forName(DBIntializer.Driver);
		con=DriverManager.getConnection(DBIntializer.Con_String,DBIntializer.Username,DBIntializer.Password);
                        //System.out.println("connection created==========================");
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {	
		System.out.println("Exception in GetCon");
	}
	
}
public static Connection getCon(){
	return con;
}
}
