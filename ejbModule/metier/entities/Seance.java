package metier.entities;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;
@Entity
public class Seance implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Salle salle;
    private LocalDate date;
    private LocalTime heure;
    private Integer duree; // En heures

    @ManyToOne
    @JoinColumn(name = "emploi_id")
    private Emploi Emploi_id;

    @ManyToOne
    @JoinColumn(name = "matiere_id")
    private Matiere matiere;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    public Seance() {
    	super();
    	// TODO Auto-generated constructor stub
    }
	public Seance( Salle salle, LocalDate date, LocalTime heure, Integer duree, Emploi emploi_id,
			Matiere matiere, Categorie categorie) {
		super();
		this.salle = salle;
		this.date = date;
		this.heure = heure;
		this.duree = duree;
		Emploi_id = emploi_id;
		this.matiere = matiere;
		this.categorie = categorie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getHeure() {
		return heure;
	}

	public void setHeure(LocalTime heure) {
		this.heure = heure;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public Emploi getEmploi_id() {
		return Emploi_id;
	}

	public void setEmploi_id(Emploi emploi_id) {
		Emploi_id = emploi_id;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}

