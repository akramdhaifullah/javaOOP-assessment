/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mySQLConnection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Akram Dhaifullah
 */
public class MySQLConnection {
    
    public static Connection getConnection() throws Exception{
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/pkn_pbo";
        String user = "root";
        String password = "";
        
        Class.forName(driver);
        Connection myConn = (Connection)DriverManager.getConnection(url, user, password);

        return myConn;
    }
    
}
