package metier.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="filiere")
public class Filiere implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int code;
	private int effectif;
	private String libelle;
	//ajouté recemment
    @OneToOne(mappedBy = "filiere", cascade = CascadeType.ALL)
	private Emploi emploi;
	public Emploi getEmploi() {
		return emploi;
	}
	public void setEmploi(Emploi emploi) {
		this.emploi = emploi;
	}
	//---
	public Filiere(int effectif, String libelle) {
		super();
		this.effectif = effectif;
		this.libelle = libelle;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getEffectif() {
		return effectif;
	}
	public void setEffectif(int effectif) {
		this.effectif = effectif;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}

