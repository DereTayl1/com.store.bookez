$(document).ready(function () {

});

function populateModal(id) {
    $.getJSON("/book/info/" + id, {
            ajax: 'true'
        }, function (data) {
            console.log(data)
            $("#modalBookTitle").text(data.title);
            $("#modalBookDate").text(data.pubDate);
            $("#modalBookAuthor").text(data.author);
            $("#modalBookPrice").text("$" + data.price);
            $("#modalBookImage").attr("src", data.imageURLFull);

        }
    )

}

function openModal(id) {
    populateModal(id);
    $('#myModal').modal();

    //POPULATE STUFF INTO THE MODAL
    //FIND ELEMENTS IN MODAL

}