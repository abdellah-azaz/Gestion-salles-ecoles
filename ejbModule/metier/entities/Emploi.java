package metier.entities;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

@Entity
@Table(name = "emploi")
public class Emploi implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;	
	
	//Ajouté recemment
	
	private String periode; // Par exemple, "Semaine 1", "Semestre 2"
	
	@OneToMany(mappedBy = "emploi", cascade = CascadeType.ALL)
	private List<Seance> seances = new ArrayList<>();
    
	//----
	//changé l'annotation de manytoone a onetoone
	
	@OneToOne
    @JoinColumn(name = "filiere_code")
    private Filiere filiere;

	public String getPeriode() {
		return periode;
	}
	public void setPeriode(String periode) {
		this.periode = periode;
	}
	public List<Seance> getSeances() {
		return seances;
	}
	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}
	public Emploi(Filiere filiere) {
		super();
		this.filiere = filiere;
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
}



