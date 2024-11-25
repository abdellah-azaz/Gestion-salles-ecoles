package metier.services.gestion_emploi;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;
import metier.entities.Emploi;
import metier.entities.Filiere;
import metier.entities.Seance;

import java.util.List;
public class GstEmploiImpl implements IGstEmploiLocal, IGstEmploiRemote {
	@PersistenceContext(unitName="SalleEjb")
	private EntityManager em;
	@Override
	public Emploi addEmploi(Emploi emploi) {
		em.persist(emploi);
		return emploi;
	}
	@Override
	public Emploi findEmploiById(Long id) {
		Emploi emploi = em.find(Emploi.class, id);
		if(emploi==null) throw new RuntimeException("Emploi du temps n'existe pas");
		return emploi;
	}
	@Override
	public List<Emploi> getEmplois(){
		TypedQuery<Emploi> requete = em.createQuery("select p from emploi p", Emploi.class);
		return requete.getResultList();
	}
	@Override
	public Emploi updateEmploi(Long id, Emploi NewEmploi) {
		Emploi oldEmploi = em.find(Emploi.class, id);
		if(oldEmploi==null) throw new RuntimeException("Emploi du temps n'existe pas");
		oldEmploi.setFiliere(NewEmploi.getFiliere());
		oldEmploi.setPeriode(NewEmploi.getPeriode());
		oldEmploi.setSeances(NewEmploi.getSeances());
		em.merge(oldEmploi);
		return oldEmploi;
	}
	@Override
	public void deleteEmploi(Long id) {
		Emploi emploi = em.find(Emploi.class, id);
		em.remove(emploi);
	}
	@Override
	public Emploi updateFiliereEmploi(Long id, Filiere filiere) {
		Emploi oldEmploi = em.find(Emploi.class, id);
		if(oldEmploi==null) throw new RuntimeException("Emploi du temps n'existe pas");
		oldEmploi.setFiliere(filiere);
		em.merge(oldEmploi);
		return oldEmploi;
	}
	@Override
	 public String setPeriode(Long id, String periode) {
		Emploi oldEmploi = em.find(Emploi.class, id);
		if(oldEmploi==null) throw new RuntimeException("Emploi du temps n'existe pas");
		oldEmploi.setPeriode(periode);
		em.merge(oldEmploi);
		return periode;
	}
	@Override
	public List<Seance> setSeances(Long id, List<Seance> seances) {
		Emploi oldEmploi = em.find(Emploi.class, id);
		if(oldEmploi==null) throw new RuntimeException("Emploi du temps n'existe pas");
		oldEmploi.setSeances(seances);
		em.merge(oldEmploi);
		return seances;
	}
}
