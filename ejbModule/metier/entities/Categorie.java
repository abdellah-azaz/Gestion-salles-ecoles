package metier.entities;


import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="categorie")
public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int code;
	private String libelle;
	public Categorie(String libelle) {
		super();
		this.libelle = libelle;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	

  
   
}

