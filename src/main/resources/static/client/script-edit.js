const id = window.location.hash.substr(1);
$.ajax({
    url: "http://localhost:8080/books/" + id,
    method: "get",
    success: function (book) {
        $("#input-title").val(book.title);
        $("#input-author").val(book.author);
        $("#input-page-count").val(book.pageCount);
    }
});

$("#button-edit").click(function () {
    const title = $("#input-title").val();
    const author = $("#input-author").val();
    const pageCount = $("#input-page-count").val();

    const book = {
        title: title,
        author: author,
        pageCount: pageCount
    };

    $.ajax({
        url: "http://localhost:8080/books/" + id,
        method: "put",
        data: JSON.stringify(book),
        contentType: "application/json",
        success: function () {
            alert("Zaktualizowano książkę");
            window.location.href = "index.html";
        }
    });
});