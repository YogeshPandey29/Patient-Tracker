/**
 * 
 */
package org.cts.utilities;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author yoges
 *
 */
public class DBUtility {
	public static Connection getConnection (String driver, String url, String username, String password) {
		Connection conn = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
