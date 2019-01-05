/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ajmalshah
 */
public class database {
     private static final String username="root";
    private static final String password= "firedrone";
    private static final String conn_string = "jdbc:mysql://localhost:3306/onlineticket";
    Connection conn=null;
    
    public void createConnection() throws SQLException{
        try {
            conn = DriverManager.getConnection(conn_string, username,password);
            System.out.println("Connection Successfull");
        }
        catch(SQLException e) {
            System.err.println(e);
        }
    }
    public void db() throws SQLException{
        database  db= new database();
        db.createConnection();
    }
    
}
