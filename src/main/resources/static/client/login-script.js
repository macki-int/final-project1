$.ajax({
    url: "http://localhost:8080/login",
    method: "post",
    success: function () {
        $("#div-not-logged-in").hide();
    },
    error: function () {
        $("#div-logged-in").hide();
    }
});

$("#button-login").click(function (event) {
    event.preventDefault();

    const username = $("#input-username").val();
    const password = $("#input-password").val();
    $.ajax({
        url: "http://localhost:8080/login",
        method: "post",
        headers: {
            "Authorization": "Basic " + btoa(username + ":" + password)
        },
        success: function() {
            $("#div-not-logged-in").hide();
            $("#div-logged-in").show();
        },
        error: function() {
            alert("błędne dane logowania");
        }
    });
});

$("#button-logout").click(function () {
    $.ajax({
        url: "http://localhost:8080/logout",
        method: "post",
        success: function() {
            $("#div-not-logged-in").show();
            $("#div-logged-in").hide();
        }
    });
});
