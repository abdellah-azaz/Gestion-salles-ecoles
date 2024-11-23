package metier.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "reservation_attent")
public class ReservationAttent implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // Clé primaire pour l'entité Charge

	   

	@ManyToOne
	@JoinColumn(name = "filiere_code") // Colonne de clé étrangère pour Filiere
	private Filiere filiere;
	@ManyToOne
	@JoinColumn(name = "categorie_code") // Colonne de clé étrangère pour Filiere
	private Categorie categorie;
	
	@ManyToOne
	@JoinColumn(name = "user_code") // Colonne de clé étrangère pour Filiere
	private User user;

	@ManyToOne
	@JoinColumn(name = "salle_code") // Colonne de clé étrangère pour Filiere
	private Salle salle;
	public ReservationAttent(Filiere filiere, Categorie categorie, User user, Salle salle) {
		super();		this.filiere = filiere;
		this.categorie = categorie;		this.user = user;
		this.salle = salle;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}    
}

