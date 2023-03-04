/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.*;  
  
public class RegisterDao {  
  
public static int register(User u){  
    int status=0;  
    try{  
        Connection con=ConnectionProvider.getCon();  
        PreparedStatement ps;  
        ps = con.prepareStatement("insert into user432 values(?,?,?)");
        ps.setString(1,u.getUname());  
        ps.setString(2,u.getUemail());  
        ps.setString(3,u.getUpass());  

        status=ps.executeUpdate();  
    }
    catch(SQLException e){}  
      
    return status;  
}  
}  
