package Etudiants;
import java.sql.*;
public class ConnexionBD {
private Connection connection;
private String Driver;
private String Url;
private String User;
private String pwd;

 public ConnexionBD( Connection connection, String driver, String url, String user, String pwd) {
	super();
	this.connection = connection;
	this.Driver = driver;
	this.Url = url;
	this.User = user;
	this.pwd = pwd;
}
public Connection getConnection() {
	return connection;
}
public void setConnection(Connection connection) {
	this.connection = connection;
}
public void getConnexion() throws SQLException { 
	 try {
		 Class.forName(Driver);
		 connection=DriverManager.getConnection(Url,User,pwd);
	 } catch (Exception e) {
		 e.printStackTrace();
		 
	 } 
 }
  
}