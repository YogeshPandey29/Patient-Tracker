/**
 * 
 */

package org.cts.serviceproviders;

import org.cts.bill.*;
import org.cts.dataaccess.BillDAO;
import org.cts.dataaccess.BillDAOImp;
import org.cts.model.Bill;


/**
 * @author yoges
 *
 */

public interface BillService {
	
	boolean billgenerationService (Bill bill);
	
}
