package metier.services.gestion_matiere;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;
import metier.entities.Matiere;
import java.util.List;
public class GstMatiereImpl implements IGstMatiereLocal, IGstMatiereRemote {
	@PersistenceContext(unitName="SalleEjb")
	private EntityManager em;
	@Override
	public Matiere addMatiere(Matiere matiere) {
		em.persist(matiere);
		return matiere;
	}
	@Override
	public Matiere findMatiereById(Long id) {
		Matiere matiere = em.find(Matiere.class, id);
		if(matiere==null) throw new RuntimeException("Matiere n'existe pas");
		return matiere;
	}
	@Override
	public List<Matiere> getMatieres(){
		TypedQuery<Matiere> requete = em.createQuery("select p from matiere p", Matiere.class);
		return requete.getResultList();
	}
	@Override
	public Matiere updateMatiere(Long id, Matiere NewMatiere) {
		Matiere oldMatiere = em.find(Matiere.class, id);
		if(oldMatiere==null) throw new RuntimeException("Matiere n'existe pas");
		oldMatiere.setLibelle(NewMatiere.getLibelle());
		em.merge(oldMatiere);
		return oldMatiere;
	}
	@Override
	public void deleteMatiere(Long id) {
		Matiere matiere = em.find(Matiere.class, id);
		em.remove(matiere);
	}
	
}
