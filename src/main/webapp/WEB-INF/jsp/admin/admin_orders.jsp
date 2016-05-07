<%@ include file="../includes/header.jsp" %>
<%@ include file="includes/admin_navbar.jsp" %>


<!-- Page Content -->
<div class="container spacer">
    <div class="row">
        <!-- Side Bar -->
        <div class="col-sm-2">
            <%@ include file="../customer/customer_sidebar.jsp" %>
        </div>
        <%--Main Content--%>
        <div class="col-sm-10">
            <div class="row half-spacer">
                <!-- Title -->
                <div class="col-sm-3">
                    <h3>Order <span class="text-primary"><strong>Manager</strong></span></h3>
                </div>
                <c:forEach var="bookOrder" items="${orderList}">
                    <ul>
                        <li>${bookOrder.shipDate}</li>
                    </ul>
                    <c:forEach var="book" items="${bookOrder.books}">
                        <li>${book.title}</li>
                    </c:forEach>
                    <li>${bookOrder.customer.name}</li>

                </c:forEach>
            </div>

        </div>

    </div>


    <%@ include file="../includes/footer.jsp" %>
