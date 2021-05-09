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

public interface PatientService {
	boolean registerPatientService (Patient patient);
}
