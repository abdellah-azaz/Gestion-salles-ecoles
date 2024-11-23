package metier.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "Salle")
public class Salle implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Clé primaire pour l'entité Charge

    @ManyToOne
    @JoinColumn(name = "matiere_code") // Colonne de clé étrangère pour Matiere
    private Matiere matiere;

    @ManyToOne
    @JoinColumn(name = "categorie_code") // Colonne de clé étrangère pour Filiere
    private Categorie categorie;
    
    private String statut;
    private String libelle;
    

    private int nbr_places; // L'attribut supplémentaire


	public Salle(Matiere matiere, Categorie categorie, String statut, String libelle, int nbr_places) {
		super();
		this.matiere = matiere;
		this.categorie = categorie;
		this.statut = statut;
		this.libelle = libelle;
		this.nbr_places = nbr_places;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Matiere getMatiere() {
		return matiere;
	}


	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public int getNbr_places() {
		return nbr_places;
	}


	public void setNbr_places(int nbr_places) {
		this.nbr_places = nbr_places;
	}

 
}


