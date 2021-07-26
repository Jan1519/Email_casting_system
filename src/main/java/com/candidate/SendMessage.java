package com.candidate;

import com.admin.EmpDao;
import java.sql.*;
import java.util.Calendar;
public class SendMessage {
static int status=0;
static int d=1;
public static int sendMsg(String sender,String reciever,String msg ){
	Connection con=EmpDao.getConnection();
	PreparedStatement ps;

	java.util.Date sqdate=Calendar.getInstance().getTime();
	java.sql.Date dat =new java.sql.Date(sqdate.getTime());
	try {
                    
		ps=con.prepareStatement("Insert into INBOX6 values(?,?,?,?,?)");
                ps.setInt(1,d);
                ps.setString(2,reciever);
		ps.setString(3,sender);
		ps.setString(4,msg);
		ps.setDate(5,dat);
            
		status=ps.executeUpdate();
                ps.close();
                con.commit();
	} catch (SQLException e) {
                    
	}
	return status;
}
}
