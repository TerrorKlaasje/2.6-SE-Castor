package org.castor.loinc.database;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnector {
	
	private static Connection con;
	
	public DatabaseConnector () {
		try{
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/castor_loinc?useSSL=false";
	    	String username = "root";
	    	String password = "team5";
	    	Class.forName(driver);	    	
	    	this.con = DriverManager.getConnection(url,username,password);
		}
		catch(SQLException e){
			e.printStackTrace();			
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return con;
	}
}