package metier.services.gestion_matiere;

import java.util.List;
import metier.entities.Matiere;

public interface IGstMatiereLocal {
	Matiere addMatiere(Matiere matiere);
	Matiere findMatiereById(Long id);
	List<Matiere> getMatieres();
	Matiere updateMatiere(Long id, Matiere matiere);
	void deleteMatiere(Long id);

}
