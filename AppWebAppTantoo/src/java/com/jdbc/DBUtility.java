package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DBUtility {

    private static final Logger LOG = Logger.getLogger(DBUtility.class.getName());

    
    public DBUtility()
    {
        
        
    }
  
  
    
    //private static Connection connection = null;
   //  private Connection dbCon;
   
   //  public String dbDriver="" ;
    private String Login="sa";
    private String password="sasasa";
//////	public  Connection getConnection() {
//////	
//////	               dbDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//////			// Store the database URL in a string
////////			String serverName = "localhost";
////////			String portNumber = "1521";
////////			String sid = "XE";
////////			String dbUrl = "jdbc:oracle:thin:@" + serverName + ":" + portNumber	+ ":" + sid;
//////			try {
//////			//Class.forName("oracle.jdbc.driver.OracleDriver");
//////                        Class.forName(dbDriver);
//////			// set the url, username and password for the database
//////			dbCon = DriverManager.getConnection(dbURL, "Neptuno", "sa");
//////			} catch (Exception e) {
//////				e.printStackTrace();
//////			}
//////			return dbCon;		
//////	}
        
        
         public static Connection getConnection() throws Exception{
        Connection cn=null;
        try {
             String dbDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(dbDriver).newInstance();
             String url = "jdbc:sqlserver://localhost:1433;databaseName=Neptuno;integratedSecurity=false";
            //String url="jdbc:oracle:thin:@localhost:1521:XE";
            cn=DriverManager.getConnection(url, "sa", "sasasa");            
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            throw e;
        }
        return cn;
    }
}