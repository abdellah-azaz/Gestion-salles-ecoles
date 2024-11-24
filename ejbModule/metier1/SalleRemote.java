package metier1;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Categorie;
import metier.entities.Salle;

@Remote
public interface SalleRemote {
	 public Salle addSalle(Salle salle);
	 public Salle getSalle(int id);
	 public List<Salle> listSalles();
	 public void modifierStatut(int id,String statut);
	 public void DeleteSalle(int id);
}
