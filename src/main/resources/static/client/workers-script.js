function reloadTableCommunities() {
    $.ajax({
        url: "http://localhost:8080/communities",
        method: "get",
        success: function (communities) {
            const $trCommunityTemplate = $("#tr-community-template");
            const $tbody = $("tbody");
            $tbody.children("tr:not(#tr-community-template)").remove();
            for (let i = 0; i < communities.length; i++) {
                const community = communities[i];
                const $trCommunity = $trCommunityTemplate.clone();
                $trCommunity.children(".td-community-id").text(community.id);
                $trCommunity.children(".td-community-name").text(community.name);
                $trCommunity.children(".td-community-street").text(community.street);
                $trCommunity.children(".td-community-number-of-house").text(community.numberOfHouse);
                $trCommunity.children(".td-community-city").text(community.city);
                $tbody.append($trCommunity);
            }
        }
    });
}


$("#table-communities").on('click', 'tr', function () {
    var id = $(this).find("td:first-child").text();
    // console.log(id);
    $.ajax({
        url: "http://localhost:8080/communities/" + id,
        method: "get",
        success: function (community) {
            $("#input-id").val(community.id);
            $("#input-name").val(community.name);
            $("#input-street").val(community.street);
            $("#input-number-of-house").val(community.numberOfHouse);
            $("#input-post-code").val(community.postCode);
            $("#input-city").val(community.city);
            $("#input-nip").val(community.nip);
        }
    });
});

$("#navbar-logout").click(function () {
    $.ajax({
        url: "http://localhost:8080/logout",
        method: "post",
        success: function() {
//            $("#div-not-logged-in").show();
//            $("#div-logged-in").hide();
        }
    });
});

reloadTableCommunities();
