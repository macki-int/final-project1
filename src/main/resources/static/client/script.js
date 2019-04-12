

function reloadTableCommunities() {
    $.ajax({
        url: "http://localhost:8080/communities/",
        method: "get",
        success: function (communities) {
            const $trCommunityTemplate = $("#tr-community-template");
            const $tbody = $("tbody");
            $tbody.children("tr:not(#tr-community-template)").remove();
            for (let i = 0; i < communities.length; i++) {
                const community = communities[i];
                const $trCommunity = $trCommunityTemplate.clone();
                // $trCommunity.removeAttr("id");
                // $trCommunity.children(".th-id").html('<a href="edit.html#' + community.id + '">' + community.id + '</a>');
                $trCommunity.children(".th-id").text(community.id);
                $trCommunity.children(".td-community-name").text(community.name);
                $trCommunity.children(".td-community-city").text(community.city);
                $trCommunity.children(".td-community-street").text(community.street);
                $trCommunity.children(".td-community-number-house").text(community.numberOfHouse);
                $trCommunity.children(".td-community-number-apartment").text(community.numberOfApartment);
                $tbody.append($trCommunity);
            }
        }
    });
}

reloadTableCommunities();