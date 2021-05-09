function docLoginValidator() {

    var doctorId = document.getElementById('doctor-id').value;
    var doctorPass = document.getElementById('doctor-password').value;

    if (doctorId == "") {
        document.getElementById('doctor-id-notif').innerHTML = "Doctor ID cannot be blank";

        return false;
    }
    if (doctorId.length != 8) {
        document.getElementById('doctor-id-notif').innerHTML = "Doctor ID is not valid";

        return false;
    }
    if (doctorPass == "") {
        document.getElementById('doctor-pass-notif').innerHTML = "Password cannot be blank";

        return false;
    }
    if (doctorPass.length != 8) {
        document.getElementById('doctor-pass-notif').innerHTML = "Password is not valid";

        return false;
    }

}