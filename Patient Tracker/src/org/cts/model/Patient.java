/**
 * 
 */
package org.cts.model;

/**
 * @author yoges
 *
 */

public class Patient {
	
	private String patientNumber;
	private String patientName;
	private int patientAge;
	private String patientAddress;
	private String patientContact;
	private String patientEmail;
	private String patientGender;
	
	/**
	 * @param patientNumber
	 * @param patientName
	 * @param patientAge
	 * @param patientAddress
	 * @param patientContact
	 * @param patientEmail
	 * @param patientGender
	 */
	public Patient(String patientNumber, String patientName, int patientAge, String patientAddress,
			String patientContact, String patientEmail, String patientGender) {
		super();
		this.patientNumber = patientNumber;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientAddress = patientAddress;
		this.patientContact = patientContact;
		this.patientEmail = patientEmail;
		this.patientGender = patientGender;
	}

	/**
	 * @return the patientNumber
	 */
	public String getPatientNumber() {
		return patientNumber;
	}

	/**
	 * @param patientNumber the patientNumber to set
	 */
	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * @return the patientAge
	 */
	public int getPatientAge() {
		return patientAge;
	}

	/**
	 * @param patientAge the patientAge to set
	 */
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	/**
	 * @return the patientAddress
	 */
	public String getPatientAddress() {
		return patientAddress;
	}

	/**
	 * @param patientAddress the patientAddress to set
	 */
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	/**
	 * @return the patientContact
	 */
	public String getPatientContact() {
		return patientContact;
	}

	/**
	 * @param patientContact the patientContact to set
	 */
	public void setPatientContact(String patientContact) {
		this.patientContact = patientContact;
	}

	/**
	 * @return the patientEmail
	 */
	public String getPatientEmail() {
		return patientEmail;
	}

	/**
	 * @param patientEmail the patientEmail to set
	 */
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	/**
	 * @return the patientGender
	 */
	public String getPatientGender() {
		return patientGender;
	}

	/**
	 * @param patientGender the patientGender to set
	 */
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	
	
	
}
