/**
 * 
 */
package org.cts.model;


/**
 * @author yoges
 *
 */
public class Bill {
	
	private String patientId;
	private String doctorName;
	private String consultationDate;
	private String prescriptionNumber;
	private String doctorId;
	private String prescriptionDate;
	private String medicineId;
	private String patientNumber;
	private int consumptionQty;
	private int consultationFee;
	
	/**
	 * @param patientId
	 * @param doctorName
	 * @param consultationDate
	 * @param prescriptionNumber
	 * @param doctorId
	 * @param prescriptionDate
	 * @param medicineId
	 * @param patientNumber
	 * @param consumptionQty
	 * @param consultationFee
	 * @param medicineCost
	 * @param totalCost
	 * @param paymentMode
	 * @param ccNumber
	 * @param billPaymentStatus
	 * @param nextConsultationDate
	 */
	
	public Bill(String patientId, String doctorName, String consultationDate, String prescriptionNumber,
			String doctorId, String prescriptionDate, String medicineId, String patientNumber, int consumptionQty,
			int consultationFee, int medicineCost, int totalCost, String paymentMode, String ccNumber,
			String billPaymentStatus, String nextConsultationDate) {
		super();
		this.patientId = patientId;
		this.doctorName = doctorName;
		this.consultationDate = consultationDate;
		this.prescriptionNumber = prescriptionNumber;
		this.doctorId = doctorId;
		this.prescriptionDate = prescriptionDate;
		this.medicineId = medicineId;
		this.patientNumber = patientNumber;
		this.consumptionQty = consumptionQty;
		this.consultationFee = consultationFee;
		this.medicineCost = medicineCost;
		this.totalCost = totalCost;
		this.paymentMode = paymentMode;
		this.ccNumber = ccNumber;
		this.billPaymentStatus = billPaymentStatus;
		this.nextConsultationDate = nextConsultationDate;
	}
	private int medicineCost;
	private int totalCost;
	private String paymentMode;
	private String ccNumber;
	private String billPaymentStatus;
	private String nextConsultationDate;

	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}
	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
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
	 * @return the prescriptionNumber
	 */
	public String getPrescriptionNumber() {
		return prescriptionNumber;
	}
	/**
	 * @param prescriptionNumber the prescriptionNumber to set
	 */
	public void setPrescriptionNumber(String prescriptionNumber) {
		this.prescriptionNumber = prescriptionNumber;
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
	 * @return the medicineId
	 */
	public String getMedicineId() {
		return medicineId;
	}
	/**
	 * @param medicineId the medicineId to set
	 */
	public void setMedicineId(String medicineId) {
		this.medicineId = medicineId;
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
	 * @return the consumptionQty
	 */
	public int getConsumptionQty() {
		return consumptionQty;
	}
	/**
	 * @param consumptionQty the consumptionQty to set
	 */
	public void setConsumptionQty(int consumptionQty) {
		this.consumptionQty = consumptionQty;
	}
	/**
	 * @return the consultationFee
	 */
	public int getConsultationFee() {
		return consultationFee;
	}
	/**
	 * @param consultationFee the consultationFee to set
	 */
	public void setConsultationFee(int consultationFee) {
		this.consultationFee = consultationFee;
	}
	/**
	 * @return the medicineCost
	 */
	public int getMedicineCost() {
		return medicineCost;
	}
	/**
	 * @param medicineCost the medicineCost to set
	 */
	public void setMedicineCost(int medicineCost) {
		this.medicineCost = medicineCost;
	}
	/**
	 * @return the totalCost
	 */
	public int getTotalCost() {
		return totalCost;
	}
	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	/**
	 * @return the paymentMode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}
	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	/**
	 * @return the ccNumber
	 */
	public String getCcNumber() {
		return ccNumber;
	}
	/**
	 * @param ccNumber the ccNumber to set
	 */
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}
	/**
	 * @return the billPaymentStatus
	 */
	public String getBillPaymentStatus() {
		return billPaymentStatus;
	}
	/**
	 * @param billPaymentStatus the billPaymentStatus to set
	 */
	public void setBillPaymentStatus(String billPaymentStatus) {
		this.billPaymentStatus = billPaymentStatus;
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

}
