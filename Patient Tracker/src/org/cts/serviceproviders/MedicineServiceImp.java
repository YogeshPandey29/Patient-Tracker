/**
 * 
 */
package org.cts.serviceproviders;

import org.cts.dataaccess.MedicineDAO;
import org.cts.dataaccess.MedicineDAOImp;
import org.cts.model.Medicine;

/**
 * @author yoges
 *
 */
public class MedicineServiceImp implements MedicineService {
	
	MedicineDAO med_dao = new MedicineDAOImp();
	
	@Override
	public boolean addMedicineService (Medicine medicine) {
		
		boolean addStatus = med_dao.addMedicineToStock(medicine);
		
		System.out.println("Medicine's addition status is: " + addStatus);
		
		return addStatus;
		
	}
	
}
