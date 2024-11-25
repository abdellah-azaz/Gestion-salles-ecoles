package metier.services.gestion_filieres;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;

import metier.entities.Emploi;
import metier.entities.Filiere;
import java.util.List;
public class GstFiliereImpl implements IGstFiliereLocal, IGstFiliereRemote {
	@PersistenceContext(unitName="SalleEjb")
	private EntityManager em;
	@Override
	public Filiere addFiliere(Filiere filiere) {
		em.persist(filiere);
		return filiere;
	}
	@Override
	public Filiere findFiliereById(Long id) {
		Filiere filiere = em.find(Filiere.class, id);
		if(filiere==null) throw new RuntimeException("Filière n'existe pas");
		return filiere;
	}
	@Override
	public List<Filiere> getFilieres(){
		TypedQuery<Filiere> requete = em.createQuery("select p from filiere p", Filiere.class);
		return requete.getResultList();
	}
	@Override
	public Filiere updateFiliere(Long id, Filiere NewFiliere) {
		Filiere oldFiliere = em.find(Filiere.class, id);
		if(oldFiliere==null) throw new RuntimeException("Filiere n'existe pas");
		oldFiliere.setEffectif(NewFiliere.getEffectif());
		oldFiliere.setLibelle(NewFiliere.getLibelle());
		em.merge(oldFiliere);
		return oldFiliere;
	}
	@Override
	public void deleteFiliere(Long id) {
		Filiere filiere = em.find(Filiere.class, id);
		em.remove(filiere);
	}
	@Override
	public int setEffectif(Long id,int newEffectif) {
		Filiere filiere = em.find(Filiere.class, id);
		filiere.setEffectif(newEffectif);
		em.merge(filiere);
		return newEffectif;
	}
	@Override
	public Emploi setEmploi(Long id, Emploi emploi) {
		Filiere filiere = em.find(Filiere.class, id);
		filiere.setEmploi(emploi);
		em.merge(filiere);
		return emploi;
	}

}
