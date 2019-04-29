function setURL() {
    const url_string = window.location.href;
    const url = new URL(url_string);
    const filter_type = url.searchParams.get("filter-type");
    const id = url.searchParams.get("id");
    let url_table;

    if (id !== null) {
         url_table = "http://localhost:8080/apartments/" + filter_type + "/" + id;
    }else{
         url_table = "http://localhost:8080/apartments";
    }
    return url_table;
}

$("#table-apartments").on('click', 'tr', function () {
    var id = $(this).find("td:first-child").text();
    if(id === ""){
        id=null;
    }
    $.ajax({
        url: "http://localhost:8080/apartments/" + id,
        method: "get",
        success: function (apartment) {
            $("#input-id").val("Identyfikator mieszkania: " + apartment.id);
            $("#input-city").val(apartment.city);
            $("#input-post-code").val(apartment.postCode);
            $("#input-street").val(apartment.street);
            $("#input-number-of-house").val(apartment.numberOfHouse);
            $("#input-number-of-apartment").val(apartment.numberOfApartment);
            $("#input-owner-id").val("Właściciel mieszkania: " + apartment.owner.id);
            getOwner(apartment.owner.id);
        }
    });
});

function getOwner(id) {
    $.ajax({
        url: "http://localhost:8080/owners/" + id,
        method: "get",
        success: function (owner) {
            $("#input-owner-first-name").val(owner.firstName);
            $("#input-owner-last-name").val(owner.lastName);
            $("#input-owner-city").val(owner.city);
            $("#input-owner-post-code").val(owner.postCode);
            $("#input-owner-street").val(owner.street);
            $("#input-owner-number-of-house").val(owner.numberOfHouse);
            $("#input-owner-number-of-apartment").val(owner.numberOfApartment);
            $("#input-owner-email").val(owner.email);
            $("#input-owner-phone").val(owner.phone);
        }
    });
}

function reloadTableApartments() {
    url_table =setURL();
    $.ajax({
        url: url_table,
        method: "get",
        success: function (apartments) {
            const $trApartmentTemplate = $("#tr-apartment-template");
            const $tbody = $("tbody");
            $tbody.children("tr:not(#tr-apartment-template)").remove();
            for (let i = 0; i < apartments.length; i++) {
                const apartment = apartments[i];
                const $trApartment = $trApartmentTemplate.clone();
                $trApartment.removeAttr("id");
                $trApartment.children(".td-id").text(apartment.id);
                $trApartment.children(".td-city").text(apartment.city);
                $trApartment.children(".td-street").text(apartment.street);
                $trApartment.children(".td-numberofhouse").text(apartment.numberOfHouse);
                $trApartment.children(".td-numberofapartment").text(apartment.numberOfApartment);
                $tbody.append($trApartment);
            }
        }
    });
}

reloadTableApartments();