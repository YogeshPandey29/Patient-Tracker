/**
 * 
 */
package org.cts.serviceproviders;

import org.cts.dataaccess.ClerkDAO;
import org.cts.dataaccess.ClerkDAOImp;
import org.cts.model.Clerk;
/**
 * @author yoges
 *
 */

public class ClerkServiceImp implements ClerkService{
	
	ClerkDAO clerkdao = new ClerkDAOImp();
	
	@Override
	public boolean registerClerkService (Clerk clerk) {
		boolean registeredStatus = clerkdao.registerClerk(clerk);
		System.out.println("Clerk registration status is: " + registeredStatus);
		
		return registeredStatus;
	}
}
