package metier.services.gestion_charge;
import metier.entities.Charge;

import java.util.List;
public interface IGstChargeRemote {
	Charge addCharge(Charge charge);
	Charge findChargeById(Long id);
	List<Charge> getCharges();
	Charge updateCharge(Long id, Charge charge);
	void deleteCharge(Long id);
	public int setCharge(Long id,int newCharge);
}
