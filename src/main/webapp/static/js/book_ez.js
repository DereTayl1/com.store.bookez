$(document).ready(function () {
    $('td:even').attr('class', 'text-primary');
    $('td:odd').attr('class', 'text-grey-867A6E');
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
}

// function addToCart(id) {
//     $.getJSON("/cart/add/" + id, {
//             ajax: 'true'
//         }, function (data) {
//         console.log(data);
//         }
//     )
// }