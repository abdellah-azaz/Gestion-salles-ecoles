package metier.services.gestion_emploi;

import java.util.List;
import metier.entities.Emploi;
import metier.entities.Filiere;
import metier.entities.Seance;

public interface IGstEmploiRemote {
	Emploi addEmploi(Emploi emploi);
	Emploi findEmploiById(Long id);
	List<Emploi> getEmplois();
	Emploi updateEmploi(Long id, Emploi emploi);
	void deleteEmploi(Long id);
	public Emploi updateFiliereEmploi(Long id, Filiere filiere);
	String setPeriode(Long id, String periode);
	List<Seance> setSeances(Long id, List<Seance> seances);
}
