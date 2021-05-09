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
public interface FeedbackAdditionService {
	
	boolean feedbackAdditionService (PatientFeedback feedback);

}
