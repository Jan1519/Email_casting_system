package com.candidate;

import com.admin.EmpDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class RegisterUser {
static int status_RegisterUser=0;
public static int register(int Id,String Name,String Email,String Password,String Country){
	//public static int register(String email,String password,String gender,String country,String name){

	Connection con=EmpDao.getConnection();
	PreparedStatement ps;
        String Query_String = "INSERT INTO userdata(Id,Name,Email,Password,Country) VALUES "
                + "('"+Id+"','"+Name+"','"+Email+"','"+Password+"','"+Country+"')";

	try {           
		ps = con.prepareStatement("Insert into userdata(?,?,?,?,?)");
               //ps = con.prepareStatement(Query_String);
		ps.setInt(1,Id);
                ps.setString(2,Name);
		ps.setString(3,Email);
		ps.setString(4,Password);
                ps.setString(5,Country);
		status_RegisterUser=ps.executeUpdate(Query_String);
		
	} catch (SQLException e) {
            //System.out.println("com.javaapp.emailcastingproject.RegisterUser.register()\n User Already Registered");
            System.out.println("com.candidate.RegisterUser.register()");
        }
	return status_RegisterUser;
	
}
}

