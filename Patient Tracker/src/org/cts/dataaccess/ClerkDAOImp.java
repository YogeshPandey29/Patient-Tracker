/**
 * 
 */
package org.cts.dataaccess;

import org.cts.utilities.DBUtilityConstants;
import org.cts.model.Clerk;
import org.cts.utilities.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author yoges
 *
 */

//concrete class for implementing the DAO method present in ClerkDAO interface

public class ClerkDAOImp implements ClerkDAO {
	
	@Override
	public boolean registerClerk (Clerk clerk) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean isRegistered = false;
		
		try {
			conn = DBUtility.getConnection (DBUtilityConstants.DRIVER, DBUtilityConstants.URL, DBUtilityConstants.USERNAME, DBUtilityConstants.PASSWORD);
			if (conn != null) {
				pstmt = conn.prepareStatement("insert into clerk(Clerk_Name, Clerk_Age, Clerk_Address, Clerk_Password, Clerk_Date_of_Joining, Clerk_Contact_Number, Clerk_EmailID, Clerk_ID) values(?, ?, ?, ?, ?, ?, ?, ?)");
				pstmt.setString(1, clerk.getClerkName());
				pstmt.setInt(2, clerk.getClerkAge());
				pstmt.setString(3, clerk.getClerkAddress());
				pstmt.setString(4,clerk.getClerkPassword());
				pstmt.setString(5, clerk.getClerkDOJ());
				pstmt.setString(6, clerk.getClerkContactNo());
				pstmt.setString(7, clerk.getClerkEmailId());
				pstmt.setString(8,  clerk.getClerkId());
				
				int rowsAffected = pstmt.executeUpdate();
				
				if (rowsAffected > 0) {
					isRegistered = true;
				}
			}
		}
		catch (Exception e) {
			if (conn != null) {
				try {
					pstmt.close();
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return isRegistered;
	}
}
