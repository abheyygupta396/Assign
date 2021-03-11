/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bin.UserBin;
import conn.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
   
      public int insert_user(UserBin ub)throws ClassNotFoundException,SQLException{
    
        Connection con=MyConnection.getConnection();
        
        String query="insert into user(fname,lname,dob,age,address1,address2,city,state,country,pcode) values(?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1, ub.getFname());
         ps.setString(2, ub.getLname());
          ps.setString(3, ub.getDob());
          ps.setInt(4, ub.getAge());
           ps.setString(5, ub.getAddress1());
            ps.setString(6, ub.getAddress2());
             ps.setString(7, ub.getCity());
              ps.setString(8, ub.getState());
               ps.setString(9, ub.getCountry());
               ps.setInt(10, ub.getPcode());
               
        int i=ps.executeUpdate();
      
        return i;
     }
}
