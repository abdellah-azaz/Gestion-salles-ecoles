package metier.services.gestion_filieres;

import java.util.List;

import metier.entities.Filiere;

public interface IGstFiliereLocal {
	Filiere addFiliere(Filiere filiere);
	Filiere findFiliereById(Long id);
	List<Filiere> getFilieres();
	Filiere updateFiliere(Long id, Filiere filiere);
	void deleteFiliere(Long id);
	int setEffectif(Long id,int newEffectif);
}
