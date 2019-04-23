function reloadTableApartments() {
    $.ajax({
        url: "http://localhost:8080/apartments",
        method: "get",
        success: function (apartments) {
            const $trApartmentTemplate = $("#tr-apartment-template");
            const $tbody = $("tbody");
            $tbody.children("tr:not(#tr-apartment-template)").remove();
            for (let i = 0; i < apartments.length; i++) {
                const apartment = apartments[i];
                const $trApartment = $trApartmentTemplate.clone();
                $trApartment.children(".td-apartment-id").text(apartment.id);
                $trApartment.children(".td-apartment-street").text(apartment.street);
                $trApartment.children(".td-apartment-number-of-house").text(apartment.numberOfHouse);
                $trApartment.children(".td-apartment-number-of-apartment").text(apartment.numberOfApartment);
                $trApartment.children(".td-apartment-post-code").text(apartment.city);
                $trApartment.children(".td-apartment-city").text(apartment.city);
                $tbody.append($trCommunity);
            }
        }
    });
}

reloadTableApartments();