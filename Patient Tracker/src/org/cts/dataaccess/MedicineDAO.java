/*
 * 
 */
package org.cts.dataaccess;

import org.cts.model.Medicine;
/**
 * @author yoges
 *
 */

public interface MedicineDAO {
	
	boolean addMedicineToStock (Medicine med);
}

