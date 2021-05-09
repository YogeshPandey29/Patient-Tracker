/**
 * 
 */
package org.cts.dataaccess;

import org.cts.model.Doctor;
import org.cts.utilities.DBUtility;
import org.cts.utilities.DBUtilityConstants;
import java.sql.*;

/**
 * @author yoges
 *
 */

public class DoctorDAOImp implements DoctorDAO {
	
	@Override
	public boolean registerDoctor (Doctor doctor) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean registeredStatus = false;
		
		try {
			conn = DBUtility.getConnection(DBUtilityConstants.DRIVER, DBUtilityConstants.URL, DBUtilityConstants.USERNAME, DBUtilityConstants.PASSWORD);
			
			if (conn != null) {
				String query = "insert into doctor(doctor_name, doctor_qualification, doctor_age, doctor_address, doctor_experience, doctor_contact, doctor_email) values (?, ?, ?, ?, ?, ?, ?)";
				pstmt = conn.prepareStatement(query);
				
				pstmt.setString(1, doctor.getDoctorName());
				pstmt.setString(2, doctor.getDoctorQualification());
				pstmt.setInt(3, doctor.getDoctorAge());
				pstmt.setString(4, doctor.getDoctorAddress());
				pstmt.setInt(5, doctor.getDoctorExperience());
				pstmt.setString(6, doctor.getDoctorContact());
				pstmt.setString(7, doctor.getDoctorEmail());
				
				int num_rows = pstmt.executeUpdate();
				
				if (num_rows > 0) {
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
