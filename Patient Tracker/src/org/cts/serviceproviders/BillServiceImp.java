/**
 * 
 */
package org.cts.serviceproviders;

import org.cts.bill.*;
import org.cts.billDAO.*;
import org.cts.dataaccess.BillDAO;
import org.cts.dataaccess.BillDAOImp;
import org.cts.model.Bill;


/**
 * @author yoges
 *
 */
public class BillServiceImp implements BillService {
	
	BillDAO billdao = new BillDAOImp();
	
	@Override
	public boolean billgenerationService (Bill newBill) {
		
		boolean billgenerationStatus = billdao.generateBill(newBill);
		System.out.println("Bill generation status is: " + billgenerationStatus);
		
		return billgenerationStatus;
	}
	
}
