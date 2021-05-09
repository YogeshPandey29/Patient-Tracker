function loginValidation() {

    var clerkId = document.getElementById('clerk-id').value;
    var clerkPass = document.getElementById('clerk-password').value;

    if (clerkId == "") {
        document.getElementById('clerk-id-notif').innerHTML = "Clerk ID cannot be empty";

        return false;
    }
    if (clerkId.length != 8) {
        document.getElementById('clerk-id-notif').innerHTML = "Clerk ID is not valid";

        return false;
    }
    if (clerkPass == "") {
        document.getElementById('clerk-pass-notif').innerHTML = "Password cannot be empty";

        return false;
    }
    if (clerkPass.length != 8) {
        document.getElementById('clerk-pass-notif').innerHTML = "Password is not valid";

        return false;
    }

}