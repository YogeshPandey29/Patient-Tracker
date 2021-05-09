/**
 * 
 */
package org.cts.serviceproviders;

import org.cts.dataaccess.MedicineDAO;
import org.cts.dataaccess.MedicineDAOImp;
import org.cts.medicine.*;
import org.cts.model.Medicine;

/**
 * @author yoges
 *
 */

public interface MedicineService {
	
	boolean addMedicineService (Medicine medicine);
}
