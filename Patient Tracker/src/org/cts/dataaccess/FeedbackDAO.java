/**
 * 
 */
package org.cts.dataaccess;

import org.cts.model.PatientFeedback;

/**
 * @author yoges
 *
 */

public interface FeedbackDAO {
	boolean addFeedback (PatientFeedback pf);
}
