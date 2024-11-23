package metier.services.gestion_charge;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;
import metier.entities.Charge;
import java.util.List;
public class GstChargeImpl implements IGstChargeLocal, IGstChargeRemote {
	@PersistenceContext(unitName="SalleEjb")
	private EntityManager em;
	@Override
	public Charge addCharge(Charge charge) {
		em.persist(charge);
		return charge;
	}
	@Override
	public Charge findChargeById(Long id) {
		Charge charge = em.find(Charge.class, id);
		if(charge==null) throw new RuntimeException("Charge n'existe pas");
		return charge;
	}
	@Override
	public List<Charge> getCharges(){
		TypedQuery<Charge> requete = em.createQuery("select p from charge p", Charge.class);
		return requete.getResultList();
	}
	@Override
	public Charge updateCharge(Long id, Charge NewCharge) {
		Charge oldCharge = em.find(Charge.class, id);
		if(oldCharge==null) throw new RuntimeException("Charge n'existe pas");
		oldCharge.setCharge(NewCharge.getCharge());
		oldCharge.setFiliere(NewCharge.getFiliere());
		oldCharge.setMatiere(NewCharge.getMatiere());
		em.merge(oldCharge);
		return oldCharge;
	}
	@Override
	public void deleteCharge(Long id) {
		Charge charge = em.find(Charge.class, id);
		em.remove(charge);
	}
	@Override
	public int setCharge(Long id,int newCharge) {
		Charge charge = em.find(Charge.class, id);
		charge.setCharge(newCharge);
		em.merge(charge);
		return newCharge;
	}
}
