function docRegValidation() {
    
    var docName = document.getElementById('doctor-name').value;
    var docAge = document.getElementById('doctor-age').value;
    var docExp = document.getElementById('doctor-experience').value;
    var docContact = document.getElementById('doctor-contact').value;
    var docEmail = document.getElementById('doctor-email').value;

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
    if (docAge == "") {
        document.getElementById('doctor-age-notif').innerHTML = "Doctor's age cannot be blank";

        return false;
    }
    if (docExp == "") {
        document.getElementById('doctor-exp-notif').innerHTML = "Experience cannot be blank";

        return false;
    }
    if (docContact == "") {
        document.getElementById('doctor-contact-notif').innerHTML = "Mobile number name cannot be blank";

        return false;
    }
    if (isNaN(docContact)) {
        document.getElementById('doctor-contact-notif').innerHTML = "Cell number should contain only numerics";

        return false;
    }
    if (docContact.length != 10) {
        document.getElementById('doctor-contact-notif').innerHTML = "Cell number should be 10 digits long";

        return false;
    }
    if (docEmail == "") {
        document.getElementById('doctor-email-notif').innerHTML = "Email ID cannot be blank";

        return false;
    }
    if (docEmail.indexOf('@') <= 0) {
        document.getElementById('doctor-email-notif').innerHTML = "Invalid email format";

        return false;
    }
    if ((docEmail.charAt(docEmail.length - 4) != '.') && (docEmail.charAt(docEmail.length - 3) != '.')) {
        document.getElementById('doctor-email-notif').innerHTML = "Invalid email format";

        return false;
    }
}