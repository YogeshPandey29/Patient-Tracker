/**
 * 
 */
package org.cts.dataaccess;

import org.cts.model.Prescription;
import org.cts.pres.*;
import org.cts.utilities.*;
import java.sql.*;


/**
 * @author yoges
 *
 */
public class PrescriptionDAOImp implements PrescriptionDAO {
	
	public boolean generatePrescription (Prescription pr) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		boolean prescriptionStatus = false;
		
		try {
			conn = DBUtility.getConnection(DBUtilityConstants.DRIVER, DBUtilityConstants.URL, DBUtilityConstants.USERNAME, DBUtilityConstants.PASSWORD);
			
			if (conn != null) {
				String query = "insert into prescription (prescription_date, doctor_id, patient_number, problem_description, prescribed_med_name, alternate_med_name, quantity, dosage, additional_notes, next_consultation_date, consultation_id, prescription_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
				ps = conn.prepareStatement(query);
				
				ps.setString(1, pr.getPrescriptionDate());
				ps.setString(2, pr.getDoctorId());
				ps.setString(3, pr.getPatientNumber());
				ps.setString(4, pr.getProblemDesc());
				ps.setString(5, pr.getPrescribedMedName());
				ps.setString(6, pr.getAlternateMedName());
				ps.setInt(7, pr.getQuantity());
				ps.setInt(8, pr.getDosage());
				ps.setString(9, pr.getAdditionalNotes());
				ps.setString(10, pr.getNextConsultationDate());
				ps.setString(11, pr.getConsultationId());
				ps.setString(12, pr.getPrescriptionId());
				
				int rowsAffected = ps.executeUpdate();
				
				if (rowsAffected > 0) {
					prescriptionStatus = true;
				}
			}
		}
		
		catch (Exception ex) {
			if (conn != null) {
				try {
					ps.close();
					conn.close();
				}
				
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return prescriptionStatus;
		
	}
}
