package metier.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "emploi")
public class Emploi implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "filiere_code")
    private Filiere filiere;

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



