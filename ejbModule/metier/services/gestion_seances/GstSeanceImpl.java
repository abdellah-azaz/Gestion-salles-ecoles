package metier.services.gestion_seances;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;
import metier.entities.Seance;
import java.util.List;

public class GstSeanceImpl implements IGstSeanceLocal, IGstSeanceRemote {
		@PersistenceContext(unitName="SalleEjb")
		private EntityManager em;
		@Override
		public Seance addSeance(Seance seance) {
			em.persist(seance);
			return seance;
		}
		@Override
		public Seance findSeanceById(Long id) {
			Seance seance = em.find(Seance.class, id);
			if(seance==null) throw new RuntimeException("Seance n'existe pas");
			return seance;
		}
		@Override
		public List<Seance> getSeances(){
			TypedQuery<Seance> requete = em.createQuery("select p from seance p", Seance.class);
			return requete.getResultList();
		}
		@Override
		public Seance updateSeance(Long id, Seance NewSeance) {
			Seance oldSeance = em.find(Seance.class, id);
			if(oldSeance==null) throw new RuntimeException("Seance n'existe pas");
			oldSeance.setCategorie(NewSeance.getCategorie());
			oldSeance.setDate(NewSeance.getDate());
			oldSeance.setDuree(NewSeance.getDuree());
			oldSeance.setHeure(NewSeance.getHeure());
			oldSeance.setMatiere(NewSeance.getMatiere());
			oldSeance.setSalle(NewSeance.getSalle());			
			oldSeance.setEmploi_id(NewSeance.getEmploi_id());
			em.merge(oldSeance);
			return oldSeance;
		}
		@Override
		public void deleteSeance(Long id) {
			Seance seance = em.find(Seance.class, id);
			em.remove(seance);
		}
		
}
