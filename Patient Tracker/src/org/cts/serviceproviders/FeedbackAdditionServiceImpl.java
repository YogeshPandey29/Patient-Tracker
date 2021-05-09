/**
 * 
 */
package org.cts.serviceproviders;

import org.cts.model.PatientFeedback;
import org.cts.dataaccess.FeedbackDAO;
import org.cts.dataaccess.FeedbackDAOImpl;


/**
 * @author yoges
 *
 */
public class FeedbackAdditionServiceImpl implements FeedbackAdditionService {
	
	FeedbackDAO fdao = new FeedbackDAOImpl();
	
	@Override
	public boolean feedbackAdditionService (PatientFeedback feedback) {
		
		boolean additionStatus = fdao.addFeedback(feedback);
		
		System.out.println("Patient Feedback Addition status is: " + additionStatus);
		
		return additionStatus;
	}
}
