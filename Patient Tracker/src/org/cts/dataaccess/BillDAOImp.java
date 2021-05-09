/**
 * 
 */
package org.cts.dataaccess;

import org.cts.bill.*;
import org.cts.model.Bill;
import org.cts.utilities.DBUtility;
import org.cts.utilities.DBUtilityConstants;
import java.sql.*;

/**
 * @author yoges\
 *
 */
public class BillDAOImp implements BillDAO {
	
	public boolean generateBill (Bill bill) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		boolean billStatus = false;
		
		try {
			conn = DBUtility.getConnection(DBUtilityConstants.DRIVER, DBUtilityConstants.URL, DBUtilityConstants.USERNAME, DBUtilityConstants.PASSWORD);
			
			if (conn != null) {
				String newQuery = "insert into medicinebill (patient_id, doctor_name, consultation_date, prescription_number, doctor_id, prescription_date, medicine_id, patient_number, consumption_qty, consultation_fee, medicine_cost, total_cost, payment_mode, cc_number, bill_payment_status, next_consultation_date) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				pst = conn.prepareStatement(newQuery);
				
				pst.setString(1, bill.getPatientId());
				pst.setString(2, bill.getDoctorName());
				pst.setString(3, bill.getConsultationDate());
				pst.setString(4, bill.getPrescriptionNumber());
				pst.setString(5, bill.getDoctorId());
				pst.setString(6, bill.getPrescriptionDate());
				pst.setString(7, bill.getMedicineId());
				pst.setString(8, bill.getPatientNumber());
				pst.setInt(9, bill.getConsumptionQty());
				pst.setInt(10, bill.getConsultationFee());
				pst.setInt(11, bill.getMedicineCost());
				pst.setInt(12, bill.getTotalCost());
				pst.setString(13, bill.getPaymentMode());
				pst.setString(14, bill.getCcNumber());
				pst.setString(15, bill.getBillPaymentStatus());
				pst.setString(16, bill.getNextConsultationDate());
				
				int numRowsAffected = pst.executeUpdate();
				
				if (numRowsAffected > 0) {
					billStatus = true;
				}
			}
		}
		catch (Exception ex) {
			if (conn != null) {
				try {
					pst.close();
					conn.close();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return billStatus;
	}

}
