function patientRegValidation() {

    var patientNo = document.getElementById('patient-number').value;
    var patientName = document.getElementById('patient-name').value;
    var patientAge = document.getElementById('patient-age').value;
    var patientContact = document.getElementById('patient-contact').value;
    var patientEmail = document.getElementById('patient-email').value;
    var patientGender = document.getElementById('patient-gender').value;

    if (patientNo == "") {
        document.getElementById('patient-number-notif').innerHTML = "Patient Number cannot be empty";

        return false;
    }
    if (patientNo.length != 8) {
        document.getElementById('patient-number-notif').innerHTML = "Patient number is not valid";

        return false;
    }
    if (patientName == "") {
        document.getElementById('patient-name-notif').innerHTML = "Patient name cannot be blank";

        return false;
    }
    if ((patientName.length < 2)) {
        document.getElementById('patient-name-notif').innerHTML = "Name cannot be less than 2 characters";

        return false;
    }
    if (!isNaN(patientName)) {
        document.getElementById('patient-name-notif').innerHTML = "Name cannot have numerics";

        return false;
    }
    if (patientAge == "") {
        document.getElementById('patient-age-notif').innerHTML = "Patient age cannot be blank";

        return false;
    }
    if (patientAge < 0) {
        document.getElementById('patient-age-notif').innerHTML = "Age entered is not valid";

        return false;
    }
    if (patientContact == "") {
        document.getElementById('patient-contact-notif').innerHTML = "Mobile number name cannot be blank";

        return false;
    }
    if (isNaN(patientContact)) {
        document.getElementById('patient-contact-notif').innerHTML = "Cell number should contain only numerics";

        return false;
    }
    if (patientContact.length != 10) {
        document.getElementById('patient-contact-notif').innerHTML = "Cell number should be 10 digits long";

        return false;
    }
    if (patientEmail == "") {
        document.getElementById('patient-email-notif').innerHTML = "Email ID cannot be blank";

        return false;
    }
    if (patientEmail.indexOf('@') <= 0) {
        document.getElementById('patient-email-notif').innerHTML = "Invalid email format";

        return false;
    }
    if ((patientEmail.charAt(patientEmail.length - 4) != '.') && (patientEmail.charAt(patientEmail.length - 3) != '.')) {
        document.getElementById('patient-email-notif').innerHTML = "Invalid email format";

        return false;
    }
    if (patientGender != "male" || patientGender != female || patientGender != other) {
        document.getElementById('patient-gender-notif').innerHTML = "Gender is not valid";

        return false;
    }
}