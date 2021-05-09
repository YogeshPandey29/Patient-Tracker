function medStockController() {

    var medId = document.getElementById('med-id').value;
    var docId = document.getElementById('doctor-id').value;
    var medName = document.getElementById('med-name').value;
    var medType = document.getElementById('med-type').value;
    var storageType = document.getElementById('storage-type').value;
    var medQty = document.getElementById('med-quantity').value;
    var price = document.getElementById('med-price').value;
    var mfgDate = document.getElementById('med-mfg-date').value;
    var expDate = document.getElementById('med-exp-date').value;


    if (medId == "") {
        document.getElementById('med-id-notif').innerHTML = "Medicine ID cannot be empty";

        return false;
    }
    if (medId.length != 5) {
        document.getElementById('med-id-notif').innerHTML = "Medicine ID is not valid";

        return false;
    }
    if(docId == "") {
        document.getElementById('doctor-id-notif').innerHTML = "Doctor ID cannot be empty";

        return false;
    }
    if (docId.length != 8) {
        document.getElementById('doctor-id-notif').innerHTML = "Dcotor ID entered is not valid";

        return false;
    }
    if (medName == "") {
        document.getElementById('med-name-notif').innerHTML = "Medicine name cannot be empty";

        return false;
    }
    if (medType == "") {
        document.getElementById('med-type-notif').innerHTML = "Medicine type cannot be empty";

        return false;
    }
    if (storageType == "") {
        document.getElementById('storage-type-notif').innerHTML = "Storage type cannot be empty";

        return false;
    }
    if (medQty == "") {
        document.getElementById('med-qty-nptif').innerHTML = "Medicine quantity to be added cannot be empty";

        return false;
    }
    if (medQty < 0) {
        document.getElementById('med-qty-nptif').innerHTML = "Medicine quantity entered is not valid";

        return false;
    }
    if (price == "") {
        document.getElementById('med-price-notif').innerHTML = "Price cannot be empty";

        return false;
    }
    if (price < 0) {
        document.getElementById('med-price-notif').innerHTML = "Price entered is not valid";

        return false;
    }
    if (mfgDate == "") {
        document.getElementById('mfg-date-notif').innerHTML = "Medicine manufacturing date cannot be empty";

        return false;
    }
    if (expDate == "") {
        document.getElementById('exp-date-notif').innerHTML = "Medicine expiration date cannot be empty";

        return false;
    }
    
 /*   var _part1 = mfgDate.split('-');
    var _subPart1 = new Date(_part1[0]-1,_part1[1], _part1[2]);
    var _part2 = expDate.split('-');
    var _subPart2 = new Date(_part2[0]-1,_part2[1],_part2[2]);

    var gap = _subPart2 - -_subPart1;

    var difference1 = gap / 1000;
    var difference2 = difference1 / 60;
    var difference3 = difference2 / 60;
    var difference4 = difference3 / 24;
    var difference5 = difference4 / 30;

    if (difference5 <  6) {
        document.getElementById('exp-date-notif').innerHTML = "Error in adding medicine to stock. The gap between Mfg Date and Exp Date is less than 6 months.";

        return false;
    }

    */


}