/**
 * 
 */
package org.cts.model;

/**
 * @author yoges
 *
 */
public class Prescription {
	
	private String prescriptionDate;
	private String doctorId;
	private String patientNumber;
	private String problemDesc;
	private String prescribedMedName;
	private String alternateMedName;
	private int quantity;
	private int dosage;
	private String additionalNotes;
	private String nextConsultationDate;
	private String consultationId;
	private String prescriptionId;
	
	/**
	 * @param prescriptionDate
	 * @param doctorId
	 * @param patientNumber
	 * @param problemDesc
	 * @param prescribedMedName
	 * @param alternateMedName
	 * @param quantity
	 * @param dosage
	 * @param additionalNotes
	 * @param nextConsultationDate
	 * @param consultationId
	 * @param prescriptionId
	 */
	
	public Prescription(String prescriptionDate, String doctorId, String patientNumber, String problemDesc,
			String prescribedMedName, String alternateMedName, int quantity, int dosage, String additionalNotes,
			String nextConsultationDate, String consultationId, String prescriptionId) {
		super();
		this.prescriptionDate = prescriptionDate;
		this.doctorId = doctorId;
		this.patientNumber = patientNumber;
		this.problemDesc = problemDesc;
		this.prescribedMedName = prescribedMedName;
		this.alternateMedName = alternateMedName;
		this.quantity = quantity;
		this.dosage = dosage;
		this.additionalNotes = additionalNotes;
		this.nextConsultationDate = nextConsultationDate;
		this.consultationId = consultationId;
		this.prescriptionId = prescriptionId;
	}
	
	
	/**
	 * @return the prescriptionDate
	 */
	public String getPrescriptionDate() {
		return prescriptionDate;
	}

	/**
	 * @param prescriptionDate the prescriptionDate to set
	 */
	public void setPrescriptionDate(String prescriptionDate) {
		this.prescriptionDate = prescriptionDate;
	}

	/**
	 * @return the doctorId
	 */
	public String getDoctorId() {
		return doctorId;
	}

	/**
	 * @param doctorId the doctorId to set
	 */
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
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
	 * @return the prescribedMedName
	 */
	public String getPrescribedMedName() {
		return prescribedMedName;
	}

	/**
	 * @param prescribedMedName the prescribedMedName to set
	 */
	public void setPrescribedMedName(String prescribedMedName) {
		this.prescribedMedName = prescribedMedName;
	}

	/**
	 * @return the alternateMedName
	 */
	public String getAlternateMedName() {
		return alternateMedName;
	}

	/**
	 * @param alternateMedName the alternateMedName to set
	 */
	public void setAlternateMedName(String alternateMedName) {
		this.alternateMedName = alternateMedName;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the dosage
	 */
	public int getDosage() {
		return dosage;
	}

	/**
	 * @param dosage the dosage to set
	 */
	public void setDosage(int dosage) {
		this.dosage = dosage;
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

	/**
	 * @return the nextConsultationDate
	 */
	public String getNextConsultationDate() {
		return nextConsultationDate;
	}

	/**
	 * @param nextConsultationDate the nextConsultationDate to set
	 */
	public void setNextConsultationDate(String nextConsultationDate) {
		this.nextConsultationDate = nextConsultationDate;
	}

	/**
	 * @return the consultationId
	 */
	public String getConsultationId() {
		return consultationId;
	}

	/**
	 * @param consultationId the consultationId to set
	 */
	public void setConsultationId(String consultationId) {
		this.consultationId = consultationId;
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
	
	
}
