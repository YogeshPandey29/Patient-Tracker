/**
 * 
 */
package org.cts.model;

/**
 * @author yoges
 *
 */
public class Doctor {
	
	private String doctorName;
	private String doctorQualification;
	private int doctorAge;
	private String doctorAddress;
	private int doctorExperience;
	private String doctorContact;
	private String doctorEmail;
	
	/**
	 * @param doctorName
	 * @param doctorQualification
	 * @param doctorAge
	 * @param doctorAddress
	 * @param doctorExperience
	 * @param doctorContact
	 * @param doctorEmail
	 */
	public Doctor(String doctorName, String doctorQualification, int doctorAge, String doctorAddress,
			int doctorExperience, String doctorContact, String doctorEmail) {
		super();
		this.doctorName = doctorName;
		this.doctorQualification = doctorQualification;
		this.doctorAge = doctorAge;
		this.doctorAddress = doctorAddress;
		this.doctorExperience = doctorExperience;
		this.doctorContact = doctorContact;
		this.doctorEmail = doctorEmail;
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
	 * @return the doctorQualification
	 */
	public String getDoctorQualification() {
		return doctorQualification;
	}

	/**
	 * @param doctorQualification the doctorQualification to set
	 */
	public void setDoctorQualification(String doctorQualification) {
		this.doctorQualification = doctorQualification;
	}

	/**
	 * @return the doctorAge
	 */
	public int getDoctorAge() {
		return doctorAge;
	}

	/**
	 * @param doctorAge the doctorAge to set
	 */
	public void setDoctorAge(int doctorAge) {
		this.doctorAge = doctorAge;
	}

	/**
	 * @return the doctorAddress
	 */
	public String getDoctorAddress() {
		return doctorAddress;
	}

	/**
	 * @param doctorAddress the doctorAddress to set
	 */
	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}

	/**
	 * @return the doctorExperience
	 */
	public int getDoctorExperience() {
		return doctorExperience;
	}

	/**
	 * @param doctorExperience the doctorExperience to set
	 */
	public void setDoctorExperience(int doctorExperience) {
		this.doctorExperience = doctorExperience;
	}

	/**
	 * @return the doctorContact
	 */
	public String getDoctorContact() {
		return doctorContact;
	}

	/**
	 * @param doctorContact the doctorContact to set
	 */
	public void setDoctorContact(String doctorContact) {
		this.doctorContact = doctorContact;
	}

	/**
	 * @return the doctorEmail
	 */
	public String getDoctorEmail() {
		return doctorEmail;
	}

	/**
	 * @param doctorEmail the doctorEmail to set
	 */
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	
	
	
	
}
