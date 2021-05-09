function feedbackInfoValidator() {

    var presId = document.getElementById('prescription-id').value;
    var consultDate = document.getElementById('consultation-date').value;
    var problemDesc = document.getElementById('problem-desc').value;
    var feedback = document.getElementById('notes').value;

    if (presId == "") {
        document.getElementById('pres-id-notif').innerHTML = "Prescription ID cannot be empty";

        return false;
    }
    if (consultDate == "") {
        document.getElementById('consult-date-notif').innerHTML = "Consultation Date cannot be empty";

        return false;
    }
    if (problemDesc == "") {
        document.getElementById('problem-desc-notif').innerHTML = "Please provide a description of your issues";

        return false;
    }
    if (feedback == "") {
        document.getElementById('feedback-notif').innerHTMl = "Please provide your feedback";

        return false;
    }

}