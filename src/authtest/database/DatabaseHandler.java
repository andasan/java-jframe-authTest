/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authtest.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author francoispolo
 */
public class DatabaseHandler {
    
    Connection conn = null;
    private static DatabaseHandler handler = null;
    
    private DatabaseHandler(){
        createConnection();
    }
    
    private void createConnection(){
        try{
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/<DBNAME>?user=<USER>&password=<PASS>&useSSL=false"
            );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static DatabaseHandler getInstance(){
        if(handler == null){
            handler = new DatabaseHandler();
        }
        
        return handler;
    }
    
//    public boolean insertUser(){
//        
//    }
    
}
