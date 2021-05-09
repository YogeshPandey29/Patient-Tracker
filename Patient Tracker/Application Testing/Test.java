
/*
 * author yoges
 */


import java.util.*;
import org.cts.dataaccess.*;
import org.cts.model.*;
import org.cts.serviceproviders.*;
import org.cts.utilities.*;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner f = new Scanner (System.in);
		
		System.out.println("<<<<<<<<<< PATIENT TRACKER APPLICATION TEST MDOULE >>>>>>>>>>");
		System.out.println();
		System.out.println("1. Perform Clerk Registration");
		System.out.println("2. Perform Doctor Registration");
		System.out.println("3. Perform Patient Registration");
		System.out.println("4. Add Medicines to Stock");
		System.out.println("5. Add/Generate Bill Information");
		System.out.println("6. Add Prescription Details");
		System.out.println("7. Submit A Feedback");
		
		System.out.println("Enter the task you want to perform: ");
		
		int taskChoice = f.nextInt();
		
		switch (taskChoice) {
		
		case(1):
			
			System.out.println("Enter Clerk's Name: ");
			f.nextLine();
			String clerkName = f.nextLine();
			System.out.println("Enter Clerk's Age: ");
			int clerkAge = f.nextInt();
			System.out.println("Enter Clerk's Address: ");
			f.nextLine();
			String clerkAddr = f.nextLine();
			System.out.println("Enter Clerk's Password: ");
			String clerkPass = f.next();
			System.out.println("Enter Clerk's DOJ: ");
			String clerkDOJ = f.next();
			System.out.println("Enter Clerk's Contact Number: ");
			String clerkContact = f.next();
			System.out.println("Enter Clerk's Email ID: ");
			String clerkEmail = f.next();
			System.out.println("Enter Clerk's ID Number: ");
			String clerkID = f.next();
		
			ClerkService service = new ClerkServiceImp();
			
			Clerk newClerkEntry = new Clerk(clerkName, clerkAge, clerkAddr, clerkPass, clerkDOJ, clerkContact, clerkEmail, clerkID);
		
			boolean status = service.registerClerkService(newClerkEntry);
			
			if (status == true) {
				System.out.println("Your account has been created successfully...");
			}
			else {
				System.out.println("Error in creating your account. Please try again later...");
			}
			
			break;
			
		case(2):
			
			System.out.println("Enter Doctor's Name: ");
			String docName = f.nextLine();
			System.out.println("Enter Doctor's Qualification: ");
			String docQualification = f.nextLine();
			System.out.println("Enter Doctor's Age: ");
			int docAge = f.nextInt();
			System.out.println("Enter Doctor's Address: ");
			String docAddr = f.nextLine();
			f.nextLine();
			System.out.println("Enter Doctor's Experience: ");
			int docExp = f.nextInt();
			System.out.println("Enter Doctor's Contact Number: ");
			String docContact = f.next();
			System.out.println("Enter Doctor's Email ID: ");
			String docEmail = f.next();
			
			DoctorService ds = new DoctorServiceImp();
			
			Doctor newDoctorEntry = new Doctor(docName, docQualification, docAge, docAddr, docExp, docContact, docEmail);
			
			boolean regStatus = ds.registerDoctorService(newDoctorEntry);
			
			if (regStatus == true) {
				System.out.println("Doctor details Registered successfully. Please Note down the Doctor Id and Password...");
			}
			else {
				System.out.println("Error in creating your account. Please try again later...");
			}
			
			break;
			
			
		case(3):
			
			System.out.println("Enter Patient Number: ");
			String patientNumber = f.next();
			System.out.println("Enter Patient Name: ");
			f.nextLine();
			String patientName = f.nextLine();
			System.out.println("Enter Patient Age: ");
			int patientAge = f.nextInt();
			System.out.println("Enter Patient Address: ");
			f.nextLine();
			String patientAddr = f.nextLine();
			System.out.println("Enter Patient Contact: ");
			String patientContact = f.next();
			System.out.println("Enter Patient Email: ");
			String patientEmail = f.next();
			System.out.println("Enter Patient Gender: ");
			String patientGender = f.next();
			
			PatientService ps = new PatientServiceImp();
			
			Patient newPatientEntry = new Patient(patientNumber, patientName, patientAge, patientAddr, patientContact, patientEmail, patientGender);
			
			boolean newPatientRegistrationStatus = ps.registerPatientService(newPatientEntry);
			
			if (newPatientRegistrationStatus == true) {
				System.out.println("Patient registered successfully. Please note down the patient number and password...");
			}
			else {
				System.out.println("Error in creating your account. Please try again later...");
			}
			
			break;
			
			
		case(4):
			
			System.out.println("Enter Medicine ID: ");
			String medID = f.next();
			System.out.println("Enter Doctor's ID: ");
			String docID = f.next();
			System.out.println("Enter Medicine Name: ");
			f.nextLine();
			String medName = f.nextLine();
			System.out.println("Enter Company Name: ");
			String comName = f.nextLine();
			System.out.println("Enter Medicine Type: ");
			String medType = f.next();
			System.out.println("Enter Medicine Storage Type: ");
			String storageType = f.next();
			System.out.println("Enter Medicine Quantity: ");
			int qty = f.nextInt();
			System.out.println("Enter Price per unit: ");
			int price = f.nextInt();
			System.out.println("Enter Medicine Mfg Date: ");
			String mfgDate = f.next();
			System.out.println("Enter Medicine Expiry Date: ");
			String expDate = f.next();
			
			MedicineService medService = new MedicineServiceImp();
			
			Medicine newMedInStock = new Medicine(medID, docID, medName, comName, medType, storageType, qty, price, mfgDate, expDate);
			
			boolean newMedAdditionStatus = medService.addMedicineService(newMedInStock);
			
			if (newMedAdditionStatus == true) {
				System.out.println("The Medicine is successfully added in the system...");
			}
			else {
				System.out.println("Failed to add medicine to the inventory...");
			}
			
			break;
			
			
		case(5):
			
			System.out.println("Enter Patient ID: ");
			String patientID = f.next();
			System.out.println("Enter Doctor's Name: ");
			f.nextLine();
			String doctorName = f.nextLine();
			System.out.println("Enter Consultation Date: ");
			String consultDate = f.next();
			System.out.println("Enter Prescription Number: ");
			String presNumber = f.next();
			System.out.println("Enter Doctor's ID: ");
			String doctorID = f.next();
			System.out.println("Enter Prescription Date: ");
			String presDate = f.next();
			System.out.println("Enter Medicine ID: ");
			String medicineID = f.next();
			System.out.println("Enter Patient Number: ");
			String patientNo = f.next();
			System.out.println("Enter Medicine Consumption Quantity: ");
			int consumptionQty = f.nextInt();
			System.out.println("Enter Consultation Fee: ");
			int consultFee = f.nextInt();
			System.out.println("Enter Medicine Cost: ");
			int medCost = f.nextInt();
			System.out.println("Enter Total Cost: ");
			int totalCost = f.nextInt();
			System.out.println("Enter Mode of Payment: ");
			String paymentMode = f.next();
			System.out.println("Enter CC Number: ");
			String ccNumber = f.next();
			System.out.println("Enter Bill Payment Status: ");
			String paymentStatus = f.next();
			System.out.println("Enter Next Consultation Date: ");
			String nextConsultDate = f.next();
			
			BillService bs = new BillServiceImp();
			
			Bill newBill = new Bill(patientID, doctorName, consultDate, presNumber, doctorID, presDate, medicineID, patientNo, consumptionQty, consultFee, medCost, totalCost, paymentMode, ccNumber, paymentStatus, nextConsultDate);
			
			boolean newbillstatus = bs.billgenerationService(newBill);
			
			if (newbillstatus == true) {
				System.out.println("Bill Data Stored Successfully...");
			}
			else {
				System.out.println("Failed to store bill data into the system. Please re-check the data entered...");
			}
			
			break;
			
			
		case(6):
			
			System.out.println("Enter Prescription Date: ");
			String prescriptionDate = f.next();
			System.out.println("Enter Doctor's ID: ");
			String docId = f.next();
			System.out.println("Enter Patient Number: ");
			String patientNO = f.next();
			System.out.println("Enter Problem Description of the patient: ");
			f.nextLine();
			String problemDesc = f.nextLine();
			System.out.println("Enter Prescribed Medicine Name: ");
			String presMedName = f.nextLine();
			System.out.println("Enter Alternate Medicine Name: ");
			String altMedName = f.nextLine();
			System.out.println("Enter Medicine Quantity: ");
			int quantity = f.nextInt();
			System.out.println("Enter Medicine Dosage Amount: ");
			int dosage = f.nextInt();
			System.out.println("Enter Additional Notes: ");
			f.nextLine();
			String notes = f.nextLine();
			System.out.println("Enter Next Consultation Date: ");
			String nextConsultationDate = f.next();
			System.out.println("Enter Consultation ID: ");
			String consultID = f.next();
			System.out.println("Enter Prescription ID: ");
			String presID = f.next();
			
			PrescriptionService prescService = new PrescriptionServiceImp();
			
			Prescription newPrescription = new Prescription (prescriptionDate, docId, patientNO, problemDesc, presMedName, altMedName, quantity, dosage, notes, nextConsultationDate, consultID, presID);
			
			boolean prescriptionAddStatus = prescService.getPrescriptionService(newPrescription);
			
			if (prescriptionAddStatus == true) {
				System.out.println("Prescription generated successfully. Please proceed further...");
			}
			else {
				System.out.println("Failed to add the details, and generate prescription...");
			}
			
			break;
			
			
		case(7):
			
			System.out.println("Enter Prescription ID: ");
			String presId = f.next();
			System.out.println("Enter Consultation Date: ");
			String consultationDATE = f.next();
			System.out.println("Enter Doctor's Name: ");
			f.nextLine();
			String doctorNAME = f.nextLine();
			System.out.println("Enter the problem description: ");
			String problemDESC = f.nextLine();
			System.out.println("Enter Additional Notes you want to send as a feedback: ");
			String additionalNotes = f.nextLine();
			
			FeedbackAdditionService feedbackService = new FeedbackAdditionServiceImpl();
			
			PatientFeedback newFeedback = new PatientFeedback(presId, consultationDATE, doctorNAME, problemDESC, additionalNotes);
			
			boolean feedbackAdditionStatus = feedbackService.feedbackAdditionService(newFeedback);
			
			
			if (feedbackAdditionStatus == true) {
				System.out.println("Patient feedback has been added successfully...");
			}
			else {
				System.out.println("Problem encountered while submitting your feeedback...");
			}
		
			
		default:
			
			System.out.println("Requested task is not valid. Please enter a valid option from the menu...");
			
		}
		
		
	}
}



