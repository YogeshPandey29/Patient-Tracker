/**
 * 
 */
package org.cts.dataaccess;

import org.cts.model.Clerk;

/**
 * @author yoges
 *
 */

//an interface containing DAO method for clerk registration

public interface ClerkDAO {
	boolean registerClerk (Clerk clerkObj);
}
