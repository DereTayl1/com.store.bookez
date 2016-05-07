<div class="row">
    <ul>
        <c:forEach var="bookOrder" items="${bookOrderList}">
            <li>${bookOrder.orderDate}</li>
            <li>${bookOrder.orderStatus}</li>
            <li>${bookOrder.shipDate}</li>
            <li>${bookOrder.totalPrice}</li>
            <c:forEach var="book" items="${bookOrder.books}">
                <li>${book.title}</li>
            </c:forEach>
        </c:forEach>

    </ul>


</div>
<!-- /.row -->