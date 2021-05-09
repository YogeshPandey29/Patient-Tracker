function billGenerator() {
    
    var patientId = document.getElementById('patient-id').value;
    var docName = document.getElementById('doctor-name').value;
    var presNumber = document.getElementById('prescription-number').value;
    var docId = document.getElementById('doctor-id').value;
    var patientNumber = document.getElementById('patient-number').value;
    var consumptionQty = document.getElementById('consumption-qty').value;
    var consultationFee = document.getElementById('consultation-fee').value;
    var medCost = document.getElementById('medicine-cost').value;
    var totalCost = document.getElementById('total-cost').value;
    
    if (patientId == "") {
        document.getElementById('patient-id-notif').innerHTML = "ID cannot be empty";
    
        return false;
    }
    if (patientId.length != 8) {
        document.getElementById('patient-id-notif').innerHTML = "ID entered is not valid";
    
        return false;
    }
    if (docName == "") {
        document.getElementById('doctor-name-notif').innerHTML = "Doctor's name cannot be blank";

        return false;
    }
    if ((docName.length < 2)) {
        document.getElementById('doctor-name-notif').innerHTML = "Name field cannot have less than 1 character";

        return false;
    }
    if (!isNaN(docName)) {
        document.getElementById('doctor-name-notif').innerHTML = "Name cannot have numerics";

        return false;
    }
    if (presNumber == "") {
        document.getElementById('pres-number-notif').innerHTML = "Prescription Number cannot be blank";

        return false;
    }
    if (docId == "") {
        document.getElementById('doctor-id-notif').innerHTML = "Doctor ID cannot be blank";

        return false;
    }
    if (docId.length != 8) {
        document.getElementById('doctor-id-notif').innerHTML = "Doctor ID is not valid";

        return false;
    }
    if (patientNumber == "") {
        document.getElementById('patient-number-notif').innerHTML = "Patient Number cannot be empty";

        return false;
    }
    if (consumptionQty == "") {
        document.getElementById('consumption-qty-notif').innerHTML = "Medicine consumption quantity cannot be null";

        return false;
    }
    if (consumptionQty < 0) {
        document.getElementById('consumption-qty-notif').innerHTML = "Medicine consumption quantity entered is not valid";

        return false;
    }
    if (consultationFee == "") {
        document.getElementById('consultation-fee-notif').innerHTML = "Consultation Fee Amount cannot be null";

        return false;
    }
    if (consultationFee < 0) {
        document.getElementById('consultation-fee-notif').innerHTML = "Consultation Fee Amount entered is not valid";

        return false;
    }
    if (medCost == "") {
        document.getElementById('medicine-cost-notif').innerHTML = "Medicine Cost cannot be null";

        return false;
    }
    if (medCost < 0) {
        document.getElementById('medicine-cost-notif').innerHTML = "Medicine Cost entered is not valid";

        return false;
    }
    if (totalCost == "") {
        document.getElementById('total-cost-notif').innerHTML = "Total Amount cannot be null";

        return false;
    }
    if (totalCost < 0) {
        document.getElementById('total-cost-notif').innerHTML = "Total Amount entered is not valid";

        return false;
    }
}