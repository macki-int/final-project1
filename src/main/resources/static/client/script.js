$("#button-add").click(function () {
    const title = $("#input-title").val();
    const author = $("#input-author").val();
    const pageCount = $("#input-page-count").val();

    const book = {
        title: title,
        author: author,
        pageCount: pageCount
    };

    $.ajax({
        url: "http://localhost:8080/books",
        method: "post",
        data: JSON.stringify(book),
        contentType: "application/json",
        success: function () {
            alert("Utworzono książkę");
            reloadTable();
        }
    });
});

function deleteBookById(id) {
    $.ajax({
        url: "http://localhost:8080/books/" + id,
        method: "delete",
        success: function () {
            alert("Usunięto książkę");
            reloadTable();
        }
    });
}

$("#button-delete").click(function() {
    const id = $("#input-id").val();
    deleteBookById(id);
});

function reloadTable() {
    $.ajax({
        url: "http://localhost:8080/books",
        method: "get",
        success: function (books) {
            const $trBookTemplate = $("#tr-book-template");
            const $tbody = $("tbody");
            $tbody.children("tr:not(#tr-book-template)").remove();
            for (let i = 0; i < books.length; i++) {
                const book = books[i];
                const $trBook = $trBookTemplate.clone();
                $trBook.removeAttr("id");
                $trBook.children(".td-id").html('<a href="edit.html#' + book.id + '">' + book.id + '</a>');
                $trBook.children(".td-title").text(book.title);
                $trBook.children(".td-author").text(book.author);
                $trBook.children(".td-page-count").text(book.pageCount);
                $trBook.find(".button-delete").click(function() {
                    deleteBookById(book.id);
                });
                $tbody.append($trBook);
            }
        }
    });
}

reloadTable();