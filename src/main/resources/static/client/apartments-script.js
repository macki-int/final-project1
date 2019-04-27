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