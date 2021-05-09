/**
 * 
 */
package org.cts.dataaccess;

import org.cts.model.Patient;
import org.cts.utilities.DBUtility;
import org.cts.utilities.DBUtilityConstants;
import java.sql.*;

/**
 * @author yoges
 *
 */
public class PatientDAOImp implements PatientDAO {
	
	public boolean registerPatient (Patient patient) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean registeredStatus = false;
		
		try {
			conn = DBUtility.getConnection(DBUtilityConstants.DRIVER, DBUtilityConstants.URL, DBUtilityConstants.USERNAME, DBUtilityConstants.PASSWORD);
			
			if (conn != null) {
				String query = "insert into patients (patient_number, patient_name, patient_age, patient_address, patient_contact, patient_email, patient_gender) values (?, ?, ?, ?, ?, ?, ?)";
				pstmt = conn.prepareStatement(query);
				
				pstmt.setString(1, patient.getPatientNumber());
				pstmt.setString(2, patient.getPatientName());
				pstmt.setInt(3, patient.getPatientAge());
				pstmt.setString(4, patient.getPatientAddress());
				pstmt.setString(5, patient.getPatientContact());
				pstmt.setString(6,  patient.getPatientEmail());
				pstmt.setString(7, patient.getPatientGender());
				
				int num_rowsAffected = pstmt.executeUpdate();
				
				if (num_rowsAffected > 0) {
					registeredStatus = true;
				}
			}
		}
		catch (Exception e) {
			if (conn != null) {
				try {
					pstmt.close();
					conn.close();
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		
		return registeredStatus;
	}
	
}
