package Etudiants;

public class Etudiant {
   private int idEtudiant;
   private String nom;
   private String prenom;
   private String email;
   private String ville;
   
public Etudiant(int idEtudiant, String nom, String prenom, String email, String ville) {
	super();
	this.idEtudiant = idEtudiant;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.ville = ville;
}

public int getIdEtudiant() {
	return idEtudiant;
}

public void setIdEtudiant(int idEtudiant) {
	this.idEtudiant = idEtudiant;
}

public Etudiant() {
	super();
	// TODO Auto-generated constructor stub
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

}
