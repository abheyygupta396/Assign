/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bin;

/**
 *
 * @author Abhey Gupta
 */
import conn.MyConnection;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class displayData {
    
     public static void main(String[] args)throws ClassNotFoundException,SQLException {
        
        String query="select * from user";
        
        Connection con=MyConnection.getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        
         while(rs.next())
        {
            out.println("--------Users details-------");
            out.println("User id is: "+rs.getInt(1));
            out.println("User firstname is: "+rs.getString(2));
            out.println("User lastname is: "+rs.getString(3));
            out.println("User DOB is: "+rs.getString(4));
            out.println("User age is: "+rs.getInt(5));
            out.println("User Address1 is: "+rs.getString(6));
            out.println("User Address2 is: "+rs.getString(7));
            out.println("User City is: "+rs.getString(8));
            out.println("User State is: "+rs.getString(9));
            out.println("User Country is: "+rs.getString(10));
             out.println("User Pincode is: "+rs.getInt(11));
             
        }

     }
}

