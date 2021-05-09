/**
 * 
 */
package org.cts.model;


/**
 * @author yoges
 *
 */

public class PatientFeedback {
	
	private String prescriptionId;
	private String consultationDate;
	private String doctorName;
	private String problemDesc;
	private String additionalNotes;
	/**
	 * @param prescriptionId
	 * @param consultationDate
	 * @param doctorName
	 * @param problemDesc
	 * @param additionalNotes
	 */
	public PatientFeedback(String prescriptionId, String consultationDate, String doctorName, String problemDesc,
			String additionalNotes) {
		super();
		this.prescriptionId = prescriptionId;
		this.consultationDate = consultationDate;
		this.doctorName = doctorName;
		this.problemDesc = problemDesc;
		this.additionalNotes = additionalNotes;
	}
	/**
	 * @return the prescriptionId
	 */
	public String getPrescriptionId() {
		return prescriptionId;
	}
	/**
	 * @param prescriptionId the prescriptionId to set
	 */
	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	/**
	 * @return the consultationDate
	 */
	public String getConsultationDate() {
		return consultationDate;
	}
	/**
	 * @param consultationDate the consultationDate to set
	 */
	public void setConsultationDate(String consultationDate) {
		this.consultationDate = consultationDate;
	}
	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	/**
	 * @return the problemDesc
	 */
	public String getProblemDesc() {
		return problemDesc;
	}
	/**
	 * @param problemDesc the problemDesc to set
	 */
	public void setProblemDesc(String problemDesc) {
		this.problemDesc = problemDesc;
	}
	/**
	 * @return the additionalNotes
	 */
	public String getAdditionalNotes() {
		return additionalNotes;
	}
	/**
	 * @param additionalNotes the additionalNotes to set
	 */
	public void setAdditionalNotes(String additionalNotes) {
		this.additionalNotes = additionalNotes;
	}
	
	

}
