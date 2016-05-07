<%@ include file="../includes/header.jsp" %>
<%@ include file="includes/admin_navbar.jsp" %>

<!-- Page Content -->
<div class="container spacer">

    <!-- Title -->
    <div class="row">
        <div class="col-lg-12">
            <h3>Admin <span class="text-primary"><strong>Toolbar</strong></span></h3>
        </div>
    </div>
    <!-- /.row -->

    <!-- Page Features -->
    <div class="row text-center">

        <div class="col-sm-4">
            <div class="thumbnail">
                <div class="caption">
                    <h1 class="fa fa-users fa-5x"></h1>
                    <h3>Customers</h3>
                    <p>User Accounts & Settings</p>
                    <p>
                        <a href="/admin/customers/" class="btn btn-danger">Manage Customers</a>
                    </p>
                </div>
            </div>
        </div>

        <div class="col-sm-4">
            <div class="thumbnail">
                <div class="caption">
                    <h1 class="fa fa-file-text fa-5x"></h1>
                    <h3>Orders</h3>
                    <p>Review & Manage Orders</p>
                    <p>
                        <a href="/admin/orders/" class="btn btn-danger">Manage Orders</a>
                    </p>
                </div>
            </div>
        </div>

        <div class="col-sm-4">
            <div class="thumbnail">
                <div class="caption">
                    <h1 class="fa fa-book fa-5x"></h1>
                    <h3>Books</h3>
                    <p>Book Inventory</p>
                    <p>
                        <a href="/admin/books/" class="btn btn-danger">Manage Inventory</a>
                    </p>
                </div>
            </div>
        </div>

    </div>
    <!-- /.row -->


    <%@ include file="../includes/footer.jsp" %>
