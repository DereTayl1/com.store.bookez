<div class="row">
    <c:forEach var="book" items="${bookList}">
        <div class="col-md-3 col-sm-6 hero-feature">

            <div class="thumbnail">
                <img class="img-corners" src="${book.imageURL}" alt="${book.title}">
                <div class="caption">
                    <h5 class="bookTitle">${book.title}</h5>
                    <div class="row">
                        <div class="col-sm-4">
                            <em class="text-success h6"><strong>$${book.price}</strong></em>
                        </div>
                        <div class="col-sm-8 center-block">
                            <div class="bookRating">
                                <c:forEach begin="1" end="${book.rating}">
                                    <i class="fa fa-star text-warning"></i>
                                </c:forEach>
                            </div>

                        </div>
                    </div>

                    <p>${book.author}</p>
                    <p>
                        <a href="#" class="btn btn-info">Buy Now!</a>
                        <button id="${book.id}" onclick="openModal(${book.id})" class="btn btn-default">More
                            Info
                        </button>

                    </p>
                </div>
            </div>

        </div>
    </c:forEach>
</div>
<!-- /.row -->