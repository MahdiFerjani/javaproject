package Etudiants;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class TestEtudiant {
	public static void main(String[]args) throws SQLException {
		Scolarite s=new Scolarite();
		List<Etudiant>etudiants=s.getEtudiant("m");
		for(Etudiant e:etudiants) {
			System.out.println(e.getNom());
		}
	}

}
