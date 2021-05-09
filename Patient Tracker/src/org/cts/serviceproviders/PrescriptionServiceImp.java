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


public class PrescriptionServiceImp implements PrescriptionService {
	
	PrescriptionDAO pdao = new PrescriptionDAOImp();
	
	@Override
	public boolean getPrescriptionService (Prescription pres) {
		
		boolean generationStatus = pdao.generatePrescription(pres);
		
		System.out.println("Prescription generation status is: " + generationStatus);
		
		return generationStatus;
	}
	
}
