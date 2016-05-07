<%@ include file="../includes/header.jsp" %>
<%@ include file="includes/customer_navbar.jsp" %>

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
                    <h3>${fullName}</h3>
                    <h3>${address}</h3>
                    <h3>${phoneNumber}</h3>
                    <h3>${email}</h3>
                </div>



            </div>
            <!-- ORDER HISTORY -->
            <%@ include file="../customer/includes/account_history.jsp" %>
        </div>
        <!-- Modal: PRODUCT INFO -->
        <%@ include file="../customer/includes/book_info.jsp" %>
    </div>


<%@ include file="../includes/footer.jsp" %>