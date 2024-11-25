package metier.services.gestion_filieres;
import metier.entities.Emploi;
import metier.entities.Filiere;
import java.util.List;
public interface IGstFiliereRemote {
	Filiere addFiliere(Filiere filiere);
	Filiere findFiliereById(Long id);
	List<Filiere> getFilieres();
	Filiere updateFiliere(Long id, Filiere filiere);
	void deleteFiliere(Long id);
	int setEffectif(Long id,int newEffectif);
	Emploi setEmploi(Long id, Emploi emploi);
}
