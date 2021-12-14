package exercice;
import java.sql.*;
public class Demojbdc {
	public static void inserePresonne(String code,String nom, String prenom ,String id,String nomVille){
		String url ="jdbc:postgresql://127.0.0.1/testjava";
		String login="postgres";
		String passwd="1234";
		Connection cn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
		
		Class.forName("org.postgresql.Driver");
		cn=DriverManager.getConnection(url,login, passwd);
		
		st=cn.createStatement();
		String req="insert into personne values ('"+code+"','"+nom+"','"+prenom+"')";
		String req1="insert into ville values ('"+id+"','"+nomVille+"')";
		//PreparedStatement pst = cn.prepareStatement("delete from Personne where code=?");
	//	pst.setString(1, "p1");
	  		

		st.executeUpdate(req1);
		
		//rs=pst.executeQuery();
		rs=st.executeQuery("select * from personne");
		while(rs.next()) {
		System.out.print(rs.getString("code"));
		
		System.out.print(" "+rs.getString(2));
		System.out.println(" "+rs.getString(3));
		}
		}
		catch(SQLException e){
		e.printStackTrace();
		} catch(ClassNotFoundException e) {
		e.printStackTrace();
		}
		finally{
		try {
		
		cn.close();
		st.close();
		rs.close();
		}
		catch(SQLException e) {
		e.printStackTrace();
		}
		}
		}
	
	public static void deletePersonne() {
		String url ="jdbc:postgresql://127.0.0.1/testjava";
		String login="postgres";
		String passwd="1234";
		Connection cn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
		
		Class.forName("org.postgresql.Driver");
		cn=DriverManager.getConnection(url,login, passwd);
		
		st=cn.createStatement();
	
		
		rs=st.executeQuery("select * from personne");
		while(rs.next()) {
		System.out.print(rs.getString("code"));
		
		System.out.print(" "+rs.getString(2));
		System.out.println(" "+rs.getString(3));
		}
		}
		catch(SQLException e){
		e.printStackTrace();
		} catch(ClassNotFoundException e) {
		e.printStackTrace();
		}
		finally{
		try {
		
		cn.close();
		st.close();
		rs.close();
		}
		catch(SQLException e) {
		e.printStackTrace();
		}
		}
		
	}
		
	public static void main(String[]args) {
		//inserepresonne("p","ferjani","mahdi","1","djerba");
		deletePersonne();
	}

}
