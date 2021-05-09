/**
 * 
 */
package org.cts.dataaccess;

import org.cts.medicine.*;
import org.cts.model.Medicine;

import java.sql.*;
import org.cts.utilities.DBUtility;
import org.cts.utilities.DBUtilityConstants;

/**
 * @author yoges
 *
 */
public class MedicineDAOImp implements MedicineDAO {
	
	public boolean addMedicineToStock (Medicine medObj) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		boolean additionStatus = false;
		
		try {
			conn = DBUtility.getConnection(DBUtilityConstants.DRIVER, DBUtilityConstants.URL, DBUtilityConstants.USERNAME, DBUtilityConstants.PASSWORD);
			
			if (conn != null) {
				String query = "insert into medicines (medicine_id, doctor_id, medicine_name, company_name, medicine_type, storage_type, quantity, price_per_unit, manufacture_date, expiry_date) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
				pst = conn.prepareStatement(query);
				
				pst.setString(1, medObj.getMedicineId());
				pst.setString(2, medObj.getDoctorId());
				pst.setString(3, medObj.getMedicineName());
				pst.setString(4, medObj.getCompanyName());
				pst.setString(5, medObj.getMedicineType());
				pst.setString(6, medObj.getStorageType());
				pst.setInt(7, medObj.getQuantity());
				pst.setInt(8, medObj.getPricePerUnit());
				pst.setString(9, medObj.getManufactureDate());
				pst.setString(10, medObj.getExpiryDate());
				
				int rows_affected = pst.executeUpdate();
				
				if (rows_affected > 0) {
					additionStatus = true;
				}
			}
		}
		
		catch (Exception e) {
			if(conn != null) {
				try {
					pst.close();
					conn.close();
				}
				
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		
		return additionStatus;
	}
}
