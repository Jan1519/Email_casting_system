package com.candidate;

import com.DB.GetCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class VerifyLogin {

public static boolean checkLogin( String Email,String Password){
	boolean status=false;
	Connection con=GetCon.getCon();
	try {
		//PreparedStatement ps=con.prepareStatement("Select * from userdata where EMAIL = ? and PASSWORD =?");
		PreparedStatement ps=con.prepareStatement("Select * from userdata where Email= ? and Password =?");
		ps.setString(1,Email);
		ps.setString(2,Password);
		ResultSet rs=ps.executeQuery();
		status=rs.next();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return status;
}
}
