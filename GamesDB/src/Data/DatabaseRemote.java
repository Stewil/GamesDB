/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Stefan
 */
public class DatabaseRemote {
    private static Connection db;
    private static Statement st;
    /* Object used to get a result from a database. the string needs to
    ** be the SQL code for acquiring the desired set. "maintains a 
    ** cursor pointing to its current row of data."
    */     
    private static ResultSet rs;
    private static Scanner kb;
    private static ResultSetMetaData rsmd;
    private static final String url = "postgres://dmztduup:bH3sPoAsfFDfBqJqeZOztV4wAEhui8X2@horton.elephantsql.com:5432/dmztduup";
    private static final String user = "dmztduup";
    private static final String password = "bH3sPoAsfFDfBqJqeZOztV4wAEhui8X2";
    
    /* Method to establish a connection to the PostgreSQL server */
    private static void establishConnection(){
        try {
            /* Establish a connection with the database, using the address,
            ** username, and password. 
            */
            db = DriverManager.getConnection(url, user, password);
            
            /* Object used for executing a static SQL statement, and returning 
            ** the results. This object can hold one ResultSet at a time. If 
            ** more are needed, more statement objects need to be created.
            */
            st = db.createStatement();    
            
            /* Instantiates the scanner 'kb' for use for user input.
            */
            kb = new Scanner(System.in);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    /* Method for sending new data to the database */
    static Boolean send(){
        boolean bool = true;
        try {
            
        } catch (Exception e) {
            System.out.println(e);
            bool = false;
        }
        return bool;
    }
    
    /* Method for siplaying results from the database */
    static void display(ResultSet rs) {
        try {
            /* object used to get metadata from the ResultSet. In this case:
            ** it is used to get the amount of columns, for use in a general
            ** method for iterating through all the columns, (and getting their
            ** labels as well)
            */
            rsmd = rs.getMetaData();
            int columns = rsmd.getColumnCount();
            
            /* A while loop, checking if there is another line in the ResultSet,
            ** and continually loops as long as this is true. 
            */
            while (rs.next()){
                // Do Work
                for (int i = 1;  i <= columns; i++) {
                    /* Usage of rsmd to get the name of the [i] column, and the 
                    ** data, and do that for each column
                    */
                    System.out.print(rsmd.getColumnName(i) + ": " 
                            + rs.getString(i) + "\t");
                }
                System.out.println("");
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
