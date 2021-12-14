package exercice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connexion {
	String url ="jdbc:postgresql://127.0.0.1/testjava";
	String login="postgres";
	String passwd="1234";
	Connection cn=null;
	Statement st=null;
	ResultSet rs=null;
}
