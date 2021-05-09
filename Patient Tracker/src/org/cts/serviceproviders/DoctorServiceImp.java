/**
 * 
 */
package org.cts.serviceproviders;

import org.cts.dataaccess.DoctorDAO;
import org.cts.dataaccess.DoctorDAOImp;
import org.cts.model.Doctor;
/**
 * @author yoges
 *
 */
public class DoctorServiceImp implements DoctorService {
	
	DoctorDAO docdao = new DoctorDAOImp();
	
	@Override
	public boolean registerDoctorService (Doctor doctor) {
		boolean registrationStatus = docdao.registerDoctor(doctor);
		
		System.out.println("Doctor's registration status is: " + registrationStatus);
		
		return registrationStatus;
	}
	
}
