package Etudiants;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Scolarite {
	Connection conn;
	ConnexionBD con=new ConnexionBD(conn,"org.postgresql.Driver","jdbc:postgresql://127.0.0.1/Etudiant","postgres","1234");
	public List<Etudiant>getEtudiant(String mc) throws SQLException{
		List<Etudiant> etd=new ArrayList<Etudiant>();
		con.getConnexion();
		try {
	PreparedStatement ps =con.getConnection().prepareStatement("select * from etudiant where nom like ?");
	ps.setString(1,"%"+mc+"%");
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		Etudiant e=new Etudiant() ;
			e.setIdEtudiant(rs.getInt("id"));
			e.setNom(rs.getString("nom"));
			e.setPrenom(rs.getString("prenom"));
			e.setEmail(rs.getString("email"));
			e.setVille(rs.getString("ville"));
			etd.add(e);
			
	}
	}catch(SQLException e) {
		e.printStackTrace();
	}
		return etd;

}
}
