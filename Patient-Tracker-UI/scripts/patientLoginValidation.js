function patientLoginValidator() {

var patientId = document.getElementById('patient-id').value;
var patientPassword = document.getElementById('patient-password').value;

if (patientId == "") {
    document.getElementById('patient-id-notif').innerHTML = "ID cannot be empty";

    return false;
}
if (patientId.length != 8) {
    document.getElementById('patient-id-notif').innerHTML = "ID entered is not valid";

    return false;
}
if (patientPassword == "") {
    document.getElementById('patient-pass-notif').innerHTML = "Password cannot be empty";

    return false;
}
if (patientPassword.length < 8) {
    document.getElementById('patient-pass-notif').innerHTML = "Password entered is not valid";

    return false;
}

}