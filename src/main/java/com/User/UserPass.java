package com.User;

import com.DB.GetCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserPass {

    String Password = null;

    public String Userpass(String Email) {
        
        Connection con = GetCon.getCon();
        String sql = "select * from userdata where Email = '" + Email + "'";
	try {
		//PreparedStatement ps=con.prepareStatement("Select * from user where USERNAME = ? and PASSWORD =?");
		PreparedStatement ps=con.prepareStatement("Select * from userdata where Email = ? and Password = ?");
		ps.setString(3,Email);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
                    //userpass = rs.getString("password");
                    Password = rs.getString(4);
                     //System.out.println(rs.getString(4));
                }		
	} catch (SQLException e) {
	}
        return Password;
    }
}




