<%@ include file="../includes/header.jsp" %>
<%@ include file="../includes/navbar.jsp" %>

<c:url var="firstUrl" value="/customer/pages/1"/>
<c:url var="lastUrl" value="/customer/pages/${totalPages}"/>
<c:url var="prevUrl" value="/customer/pages/${currentIndex - 1}"/>
<c:url var="nextUrl" value="/customer/pages/${currentIndex + 1}"/>


    <script src="/static/js/book_ez.js" type="text/javascript"></script>


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
                    <h3>Book <span class="text-primary"><strong>List</strong></span></h3>
                </div>
                <!-- Filter -->
                <div class="col-sm-2">
                    <div id="filterTag" class="list-inline pull-right">
                        Current Filter:<span class="text-success"><strong> Rating</strong></span>
                    </div>
                </div>
                <!-- Pagination -->
                <div class="col-sm-7">
                    <%@ include file="../customer/includes/book_pagination.jsp" %>
                </div>
            </div>
            <!-- BOOK LIST -->
            <%@ include file="../customer/includes/book_list.jsp" %>
        </div>
        <!-- Modal: PRODUCT INFO -->
        <%@ include file="../customer/includes/book_info.jsp" %>
    </div>


    <%@ include file="../includes/footer.jsp" %>
