/**
 * 
 */
package org.cts.dataaccess;

import org.cts.model.PatientFeedback;
import java.sql.*;
import org.cts.utilities.DBUtility;
import org.cts.utilities.DBUtilityConstants;


/**
 * @author yoges
 *
 */
public class FeedbackDAOImpl implements FeedbackDAO {
	
	public boolean addFeedback (PatientFeedback pf) {
	Connection conn = null;
	PreparedStatement ps = null;
	boolean feedbackAdditionStatus = false;
	
	try {
		conn = DBUtility.getConnection(DBUtilityConstants.DRIVER, DBUtilityConstants.URL, DBUtilityConstants.USERNAME, DBUtilityConstants.PASSWORD);
		
		if (conn != null) {
			String requestedQuery = "insert into feedback (prescription_id, consultation_date, doctor_name, problem_description, additional_notes) values (?, ?, ?, ?, ?)";
			
			ps = conn.prepareStatement(requestedQuery);
			
			ps.setString(1, pf.getPrescriptionId());
			ps.setString(2, pf.getConsultationDate());
			ps.setString(3, pf.getDoctorName());
			ps.setString(4, pf.getProblemDesc());
			ps.setString(5, pf.getAdditionalNotes());
			
			int numRowsAffected = ps.executeUpdate();
			
			if (numRowsAffected > 0) {
				feedbackAdditionStatus = true;
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
	
	return feedbackAdditionStatus;
}
	
}
