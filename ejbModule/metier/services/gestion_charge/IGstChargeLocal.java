package metier.services.gestion_charge;

import java.util.List;
import metier.entities.Charge;

public interface IGstChargeLocal {
	Charge addCharge(Charge charge);
	Charge findChargeById(Long id);
	List<Charge> getCharges();
	Charge updateCharge(Long id, Charge charge);
	void deleteCharge(Long id);
	public int setCharge(Long id,int newCharge);

}
