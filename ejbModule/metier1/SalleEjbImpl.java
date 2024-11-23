package metier1;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import metier.entities.Salle;


@Stateless(name="SAL")
public class SalleEjbImpl implements SalleLocale,SalleRemote {
	@PersistenceContext(unitName = "SalleEjb") 
	private EntityManager em;
	@Override
	public Salle addSalle(Salle salle) {
		// TODO Auto-generated method stub
		 em.persist(salle);
		 return salle;
	}

	@Override
	public Salle getSalle(int id) {
		// TODO Auto-generated method stub
		 Salle salle=em.find(Salle.class, id);
		 if (salle==null) throw new 
		RuntimeException("salle introuvable");
		 return salle;
	}

	@Override
	public List<Salle> listSalles() {
		// TODO Auto-generated method stub
		 javax.persistence.Query req= em.createQuery("select s from Salle s");
		 return req.getResultList();
		/* CriteriaBuilder cb = em.getCriteriaBuilder(); // Obtenir l'instance de CriteriaBuilder
		    CriteriaQuery<Categorie> cq = cb.createQuery(Categorie.class); // Créer une requête pour l'entité Categorie
		    Root<Categorie> root = cq.from(Categorie.class); // Définir la racine de la requête
		    cq.select(root); // Spécifier la sélection (tous les champs)
		    return em.createQuery(cq).getResultList();*/
	}

	@Override
	public void modifierStatut(int id,String statut) {
		// TODO Auto-generated method stub
		 Salle salle=em.find(Salle.class, id);
		 salle.setStatut(statut);
		 
	}

	@Override
	public void DeleteSalle(int id) {
		// TODO Auto-generated method stub
		 Salle salle=em.find(Salle.class, id);
		 em.remove(salle);
	}

}
