package org.model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;



public class DAOHelloWorld{
	
	private static String URL = "jdbc:mysql://localhost:3306/helloworld?autoReconnect=true&useSSL=false";
	private static String LOGIN = "root";
	private static String PASSWORD = "1234";
	private Connection connection;
	private Statement statement;
	
	public DAOHelloWorld() {
		this.connection = null;
		this.statement = null;
	}
	

	 public Boolean open() {
		 
	        try {
	              Class.forName("com.mysql.jdbc.Driver");
	              this.connection = DriverManager.getConnection(DAOHelloWorld.URL, DAOHelloWorld.LOGIN, DAOHelloWorld.PASSWORD);
	               this.statement = this.connection.createStatement();
	        	} catch (final ClassNotFoundException e) {
	        		e.printStackTrace();
	        		return false;
	        	} catch (final SQLException e) {
	        		e.printStackTrace();
	        		return false;
	        	}
	        return true;
	}
	
	public void close(){

	}
	
	public String getQuerySelectFirstHelloWorld() throws SQLException {
		
		return "SELECT HelloWorld.helloworld FROM HelloWorld ;";
	} 

	public ResultSet executeQuery(final String query) {

		try {
			final ResultSet s = this.statement.executeQuery(query);
			s.next();
			return s;
		} catch (final SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

}

	
