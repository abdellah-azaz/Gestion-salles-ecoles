package metier.entities;


import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="user")
public class User implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int code;
	private String nom;
	private String prenom;
	private String telephon;
	private String mot_de_passe;
	private String statut;
	public User(String nom, String prenom, String telephon, String mot_de_passe, String statut) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephon = telephon;
		this.mot_de_passe = mot_de_passe;
		this.statut = statut;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
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
	public String getTelephon() {
		return telephon;
	}
	public void setTelephon(String telephon) {
		this.telephon = telephon;
	}
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	

	
	

  
   
}

