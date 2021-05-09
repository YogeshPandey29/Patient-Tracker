/**
 * 
 */
package org.cts.serviceproviders;

import org.cts.dataaccess.PatientDAO;
import org.cts.dataaccess.PatientDAOImp;
import org.cts.model.Patient;

/**
 * @author yoges
 *
 */
public class PatientServiceImp implements PatientService {
	
	PatientDAO p = new PatientDAOImp();
	
	@Override
	public boolean registerPatientService (Patient patient) {
		
		boolean registrationStatus = p.registerPatient(patient);
		
		System.out.println("Patient's registration status is: " + registrationStatus);
		
		return registrationStatus;
		
	}
}
