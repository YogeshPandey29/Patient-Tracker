/**
 * 
 */
package org.cts.model;

/**
 * @author yoges
 *
 */

public class Medicine {
	
	private String medicineId;
	private String doctorId;
	private String medicineName;
	private String companyName;
	private String medicineType;
	private String storageType;
	private int quantity;
	private int pricePerUnit;
	private String manufactureDate;
	private String expiryDate;
	
	/**
	 * @param medicineId
	 * @param doctorId
	 * @param medicineName
	 * @param companyName
	 * @param medicineType
	 * @param storageType
	 * @param quantity
	 * @param pricePerUnit
	 * @param manufactureDate
	 * @param expiryDate
	 */
	public Medicine(String medicineId, String doctorId, String medicineName, String companyName, String medicineType,
			String storageType, int quantity, int pricePerUnit, String manufactureDate, String expiryDate) {
		super();
		this.medicineId = medicineId;
		this.doctorId = doctorId;
		this.medicineName = medicineName;
		this.companyName = companyName;
		this.medicineType = medicineType;
		this.storageType = storageType;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
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
	 * @return the medicineName
	 */
	public String getMedicineName() {
		return medicineName;
	}

	/**
	 * @param medicineName the medicineName to set
	 */
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the medicineType
	 */
	public String getMedicineType() {
		return medicineType;
	}

	/**
	 * @param medicineType the medicineType to set
	 */
	public void setMedicineType(String medicineType) {
		this.medicineType = medicineType;
	}

	/**
	 * @return the storageType
	 */
	public String getStorageType() {
		return storageType;
	}

	/**
	 * @param storageType the storageType to set
	 */
	public void setStorageType(String storageType) {
		this.storageType = storageType;
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
	 * @return the pricePerUnit
	 */
	public int getPricePerUnit() {
		return pricePerUnit;
	}

	/**
	 * @param pricePerUnit the pricePerUnit to set
	 */
	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	/**
	 * @return the manufactureDate
	 */
	public String getManufactureDate() {
		return manufactureDate;
	}

	/**
	 * @param manufactureDate the manufactureDate to set
	 */
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	/**
	 * @return the expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}
