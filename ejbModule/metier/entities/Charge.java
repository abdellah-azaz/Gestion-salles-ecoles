package metier.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "charge")
public class Charge implements Serializable {
	static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "matiere_code")
    private Matiere matiere;

    @ManyToOne
    @JoinColumn(name = "filiere_code") 
    private Filiere filiere;
    
    @ManyToOne
    @JoinColumn(name = "categorie_code") 
    private Categorie categorie;

    private int charge; 

    public Charge() {
    }

    public Charge(Matiere matiere, Filiere filiere, Categorie categorie ,int charge) {
        this.matiere = matiere;
        this.filiere = filiere;
        this.categorie=categorie;
        this.charge = charge;
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
    	this.categorie=categorie;
    }
    public int getCharge() {
        return charge;
    }
    public void setCharge(int charge) {
        this.charge = charge;
    }
}

