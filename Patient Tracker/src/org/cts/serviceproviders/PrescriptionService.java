/**
 * 
 */
package org.cts.serviceproviders;

import org.cts.model.Prescription;
import org.cts.dataaccess.PrescriptionDAO;
import org.cts.dataaccess.PrescriptionDAOImp;


/**
 * @author yoges
 *
 */

public interface PrescriptionService {
	
	boolean getPrescriptionService(Prescription p);
	
}
