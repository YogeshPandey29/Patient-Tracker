function prescriptionDetailsValidator() {

    var docId = document.getElementById('doctor-id').value;
    var patientNumber = document.getElementById('patient-number').value;
    var problemDesc = document.getElementById('problem-desc').value;
    var prescribedMedName = documenr.getElementById('prescribed-med-name').value;
    var altMedName = document.getElementById('alternate-med-name').value;
    var consumptionQty = document.getElementById('consumption-qty').value;
    var dosage = document.getElementById('med-dosage').value;

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
    if (patientNumber.length != 8) {
        document.getElementById('patient-number-notif').innerHTML = "Patient number is not valid";

        return false;
    }
    if (problemDesc == "") {
        document.getElementById('problem-desc-notif').innerHTML = "Please enter your problems and symptoms";

        return false;
    }
    if (prescribedMedName == "") {
        document.getElementById('pres-medName-notif').innerHTML = "Enter the prescribed medicine name";

        return false;
    }
    if (altMedName == "") {
        document.getElementById('alt-medName-notif').innerHTML = "Enter the corresponding alternate medicine name";

        return false;
    }
    if (consumptionQty == "") {
        document.getElementById('consumption-qty-notif').innerHTML = "Medicine consumption quantity cannot be left blank";

        return false;
    }
    if (consumptionQty < 0) {
        document.getElementById('consumption-qty-notif').innerHTML = "Medicine consumption quantity entered is not valid";

        return false;
    }
    if (dosage == "") {
        document.getElementById('med-dosage-notif').innerHTML = "Medicine dosage cannot be left blank";

        return false;
    }
    if (dosage < 0) {
        document.getElementById('med-dosage-notif').innerHTML = "Medicine dosage entered is not valid";

        return false;
    }

}