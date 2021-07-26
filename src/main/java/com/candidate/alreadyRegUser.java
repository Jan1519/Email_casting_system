package com.candidate;

import com.admin.EmpDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class alreadyRegUser {

    public static boolean alreadyRegister(int ID, String Name, String Email) {
        
        boolean status_alreadyRegUser = true;
        Connection con = EmpDao.getConnection();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement("Select * from userdata where Name = ? and Email =?");
            ps.setInt(1, ID);
            ps.setString(2, Name);
            ps.setString(3, Email);
            ResultSet rs = ps.executeQuery();

            status_alreadyRegUser = rs.next();

        } catch (SQLException e) {
            System.out.println("com.candidate.alreadyRegUser.alreadyRegister()");
        }
        return status_alreadyRegUser;

    }
}
