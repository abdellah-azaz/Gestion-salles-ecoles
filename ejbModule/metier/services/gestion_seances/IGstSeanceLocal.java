package metier.services.gestion_seances;

import java.util.List;
import metier.entities.Seance;

public interface IGstSeanceLocal {
	Seance addSeance(Seance seance);
	Seance findSeanceById(Long id);
	List<Seance> getSeances();
	Seance updateSeance(Long id, Seance seance);
	void deleteSeance(Long id);
}
