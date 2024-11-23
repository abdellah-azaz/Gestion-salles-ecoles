package metier1;

import java.util.List;


import javax.ejb.Local;

import metier.entities.Salle;

@Local
public interface SalleLocale {
	 public Salle addSalle(Salle salle);
	 public Salle getSalle(int id);
	 public List<Salle> listSalles();
	 public void modifierStatut(int id,String statut);
	 public void DeleteSalle(int id);
}
