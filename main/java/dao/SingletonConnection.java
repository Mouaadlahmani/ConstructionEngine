package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	private static Connection connection;
	static {
		try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/construction","root","admin");
	        }catch(Exception e){
	         System.out.println(e);
	        }
	}
	public static Connection getConnection() {
		return connection;
	}
}
