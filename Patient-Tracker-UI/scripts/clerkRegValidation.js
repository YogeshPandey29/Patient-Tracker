function validateForm() {

    var clerkName = document.getElementById('clerk-name').value;
    var clerkAge = document.getElementById('clerk-age').value;
    var clerkPass = document.getElementById('clerk-password').value;
    var clerkContact = document.getElementById('clerk-contact').value;
    var clerkEmail = document.getElementById('clerk-email').value;
    var clerkId = document.getElementById('clerk-id').value;


    if (clerkName == "") {
        document.getElementById('clerk-name-notif').innerHTML = "Clerk name cannot be blank";

        return false;
    }
    if ((clerkName.length < 2)) {
        document.getElementById('clerk-name-notif').innerHTML = "Name cannot be less than 1 character";

        return false;
    }
    if (!isNaN(clerkName)) {
        document.getElementById('clerk-name-notif').innerHTML = "Name cannot have numerics";

        return false;
    }
    if (clerkAge == "") {
        document.getElementById('clerk-age-notif').innerHTML = "Clerk age cannot be blank";

        return false;
    }
    if (clerkPass == "") {
        document.getElementById('clerk-pass-notif').innerHTML = "Password cannot be blank";

        return false;
    }
    if (clerkPass.length < 8) {
        document.getElementById('clerk-pass-notif').innerHTML = "Password should be atleast 8 chars long";

        return false;
    }

    if (clerkContact == "") {
        document.getElementById('clerk-contact-notif').innerHTML = "Mobile number name cannot be blank";

        return false;
    }
    if (isNaN(clerkContact)) {
        document.getElementById('clerk-contact-notif').innerHTML = "Cell number should contain only numerics";

        return false;
    }
    if (clerkContact.length != 10) {
        document.getElementById('clerk-contact-notif').innerHTML = "Cell number should be 10 digits long";

        return false;
    }
    if (clerkEmail == "") {
        document.getElementById('clerk-email-notif').innerHTML = "Email ID cannot be blank";

        return false;
    }
    if (clerkEmail.indexOf('@') <= 0) {
        document.getElementById('clerk-email-notif').innerHTML = "Invalid email format";

        return false;
    }
    if ((clerkEmail.charAt(clerkEmail.length - 4) != '.') && (clerkEmail.charAt(clerkEmail.length - 3) != '.')) {
        document.getElementById('clerk-email-notif').innerHTML = "Invalid email format";

        return false;
    }
    if (clerkId == "") {
        document.getElementById('clerk-id-notif').innerHTML = "Clerk ID cannot be blank";

        return false;
    }
}