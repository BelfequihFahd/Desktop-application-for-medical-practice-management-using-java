/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ouarg
 */
public class connect {
    
    public static Connection connectdb() throws ClassNotFoundException{
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","");
            
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
            
    }

    
    
}
