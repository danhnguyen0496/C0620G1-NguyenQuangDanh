<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/6/2020
  Time: 10:01 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>List Product</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

    <style>
        body {
            color: #566787;
            background: #f5f5f5;
            font-family: 'Varela Round', sans-serif;
            font-size: 13px;
        }

        .table-responsive {
            margin: 30px 0;
        }

        .table-wrapper {
            background: #fff;
            padding: 20px 25px;
            border-radius: 3px;
            min-width: 1000px;
            box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
        }

        .table-title {
            padding-bottom: 15px;
            background: #435d7d;
            color: #fff;
            padding: 16px 30px;
            min-width: 100%;
            margin: -20px -25px 10px;
            border-radius: 3px 3px 0 0;
        }

        .table-title h2 {
            margin: 5px 0 0;
            font-size: 24px;
        }

        .table-title .btn-group {
            float: right;
        }

        .table-title .btn {
            color: #fff;
            float: right;
            font-size: 13px;
            border: none;
            min-width: 50px;
            border-radius: 2px;
            border: none;
            outline: none !important;
            margin-left: 10px;
        }

        .table-title .btn i {
            float: left;
            font-size: 21px;
            margin-right: 5px;
        }

        .table-title .btn span {
            float: left;
            margin-top: 2px;
        }

        table.table tr th, table.table tr td {
            border-color: #e9e9e9;
            padding: 12px 15px;
            vertical-align: middle;
        }

        table.table tr th:first-child {
            width: 60px;
        }

        table.table tr th:last-child {
            width: 100px;
        }

        table.table-striped tbody tr:nth-of-type(odd) {
            background-color: #fcfcfc;
        }

        table.table-striped.table-hover tbody tr:hover {
            background: #f5f5f5;
        }

        table.table th i {
            font-size: 13px;
            margin: 0 5px;
            cursor: pointer;
        }

        table.table td:last-child i {
            opacity: 0.9;
            font-size: 22px;
            margin: 0 5px;
        }

        table.table td a {
            font-weight: bold;
            color: #566787;
            display: inline-block;
            text-decoration: none;
            outline: none !important;
        }

        table.table td a:hover {
            color: #2196F3;
        }

        table.table td a.edit {
            color: #FFC107;
        }

        table.table td a.delete {
            color: #F44336;
        }

        table.table td i {
            font-size: 19px;
        }

        table.table .avatar {
            border-radius: 50%;
            vertical-align: middle;
            margin-right: 10px;
        }

        .pagination {
            float: right;
            margin: 0 0 5px;
        }

        .pagination li a {
            border: none;
            font-size: 13px;
            min-width: 30px;
            min-height: 30px;
            color: #999;
            margin: 0 2px;
            line-height: 30px;
            border-radius: 2px !important;
            text-align: center;
            padding: 0 6px;
        }

        .pagination li a:hover {
            color: #666;
        }

        .pagination li.active a, .pagination li.active a.page-link {
            background: #03A9F4;
        }

        .pagination li.active a:hover {
            background: #0397d6;
        }

        .pagination li.disabled i {
            color: #ccc;
        }

        .pagination li i {
            font-size: 16px;
            padding-top: 6px
        }

        .hint-text {
            float: left;
            margin-top: 10px;
            font-size: 13px;
        }

        /* Custom checkbox */
        .custom-checkbox {
            position: relative;
        }

        .custom-checkbox input[type="checkbox"] {
            opacity: 0;
            position: absolute;
            margin: 5px 0 0 3px;
            z-index: 9;
        }

        .custom-checkbox label:before {
            width: 18px;
            height: 18px;
        }

        .custom-checkbox label:before {
            content: '';
            margin-right: 10px;
            display: inline-block;
            vertical-align: text-top;
            background: white;
            border: 1px solid #bbb;
            border-radius: 2px;
            box-sizing: border-box;
            z-index: 2;
        }

        .custom-checkbox input[type="checkbox"]:checked + label:after {
            content: '';
            position: absolute;
            left: 6px;
            top: 3px;
            width: 6px;
            height: 11px;
            border: solid #000;
            border-width: 0 3px 3px 0;
            transform: inherit;
            z-index: 3;
            transform: rotateZ(45deg);
        }

        .custom-checkbox input[type="checkbox"]:checked + label:before {
            border-color: #03A9F4;
            background: #03A9F4;
        }

        .custom-checkbox input[type="checkbox"]:checked + label:after {
            border-color: #fff;
        }

        .custom-checkbox input[type="checkbox"]:disabled + label:before {
            color: #b8b8b8;
            cursor: auto;
            box-shadow: none;
            background: #ddd;
        }

        /* Modal styles */
        .modal .modal-dialog {
            max-width: 400px;
        }

        .modal .modal-header, .modal .modal-body, .modal .modal-footer {
            padding: 20px 30px;
        }

        .modal .modal-content {
            border-radius: 3px;
            font-size: 14px;
        }

        .modal .modal-footer {
            background: #ecf0f1;
            border-radius: 0 0 3px 3px;
        }

        .modal .modal-title {
            display: inline-block;
        }

        .modal .form-control {
            border-radius: 2px;
            box-shadow: none;
            border-color: #dddddd;
        }

        .modal textarea.form-control {
            resize: vertical;
        }

        .modal .btn {
            border-radius: 2px;
            min-width: 100px;
        }

        .modal form label {
            font-weight: normal;
        }
    </style>

</head>
<body>


<form method="post">

    <div class="col-sm-2" style="text-align: center">
        <a href="/products?action=''" class="btn btn-success">
            <span>Management Product</span></a>
    </div>
    <p><h4 style="color: red; margin-left: 30px">${message}</h4></p>
    <div class="container-xl">
        <div class="table-responsive">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-4">

                            <h2>Manage <b>Products</b></h2>

                        </div>

                        <!-- Thêm mới tại trang hiện thị danh sách -->

                        <div class="col-sm-4">
                            <a href="#addModal" class="btn btn-success" data-toggle="modal"><i
                                    class="material-icons">&#xE147;</i> <span>Add New Product</span></a>
                        </div>

                        <!-- Tìm kiếm -->

                        <div class="col-sm-4">
                            <input class="btn" type="text" name="nameProduct" placeholder="Search Name"
                                   style="color: black;background-color: white">
                            <input class="btn btn-success" type="submit" value="Search Name" placeholder="Enter Name">
                        </div>

<%--                        <div class="col-sm-4">--%>

<%--                            <input class="btn" type="text" name="priceProduct" placeholder="Search Price"--%>
<%--                                   style="color: black;background-color: white">--%>
<%--                            <a href="/products?action=findPrice" class="btn btn-success"> <input class="btn btn-success" type="submit" value="Search Price" placeholder="Enter Price"></a>--%>
<%--                        </div>--%>

                    </div>
                </div>
                <table id="table" class="table table-striped table-hover">
                    <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Color</th>
                        <th>Description</th>
                        <th>Category</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="product" items="${productList}">
                        <tr>
                            <td><c:out value="${product.productId}"></c:out></td>
                            <td><c:out value="${product.productName}"></c:out></td>
                            <td><c:out value="${product.productPrice}"></c:out></td>
                            <td><c:out value="${product.productQuantity}"></c:out></td>
                            <td><c:out value="${product.productColor}"></c:out></td>
                            <td><c:out value="${product.productDescription}"></c:out></td>

                            <td>
                                <c:forEach var="category" items="${categoryList}">
                                <c:if test="${category.getCategoryId().equals(product.getCategoryId())}">
                                    <c:out value="${category.categoryName}"></c:out>
                                </c:if>
                                </c:forEach>
                            <td>
                                <a href="#"
                                   onclick="setInfor('${product.productId}','${product.productName}','${product.productPrice}',
                                           '${product.productQuantity}', '${product.productColor}', '${product.productDescription}',
                                           '${product.categoryId}')" class="edit"
                                   data-toggle="modal" data-target="#editModal">
                                    <i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>

                                <a href="#" onclick="setId('${product.productId}')" class="delete"
                                   data-toggle="modal" data-target="#deleteModal">
                                    <i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</form>


<!-- Thêm mới tại trang hiện thị danh sách -->
<!-- Add Modal HTML -->
<form method="post">
    <div id="addModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <form>
                    <div class="modal-header">
                        <h4 class="modal-title">Add Product</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    </div>
                    <div class="modal-body">

                            <div class="form-group">
                            <label>Id</label>
                            <input type="text" name="productId" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>Name</label>
                            <input type="text" name="productName" class="form-control" required>
                        </div>

                        <div class="form-group">
                            <label>Price</label>
                            <input type="text" name="productPrice" class="form-control" required>
                        </div>

                        <div class="form-group">
                            <label>Quantity</label>
                            <input type="text" name="productQuantity" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>Color</label>
                            <select name="productColor" class="form-control">
                                <option>Red</option>
                                <option>Blue</option>
                                <option>Black</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label>Description</label>
                            <textarea name="productDescription" class="form-control"></textarea>
                        </div>

                        <div class="form-group">
                            <input type="hidden" name="action" value="create">
                            <label>Category</label>
                            <select name="categoryId" class="form-control">
                                <c:forEach var="category" items="${categoryList}">
                                    <option value="${category.categoryId}">${category.categoryName}</option>
                                </c:forEach>
                            </select>
                        </div>

                    </div>
                    <div class="modal-footer">
                        <input type="hidden" name="action" value="create">
                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                        <input type="submit" class="btn btn-success" value="Add">
                    </div>
                </form>
            </div>
        </div>
    </div>
</form>

<!-- Chỉnh sửa tại trang hiện thị danh sách -->
<!-- Edit Modal HTML -->

<div id="editModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="/products" method="post">
                <input type="hidden" name="action" value="edit"/>
                <input type="hidden" id="idEditHidden" name="idEditHidden"/>

                <div class="modal-header">
                    <h4 class="modal-title">Edit Product</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">

                    <div class="form-group">
                        <label>Name</label>
                        <input type="text" name="productName" id="productNameId" class="form-control">
                    </div>

                    <div class="form-group">
                        <label>Price</label>
                        <input type="text" name="productPrice" id="productPriceId" class="form-control">
                    </div>

                    <div class="form-group">
                        <label>Quantity</label>
                        <input type="text" name="productQuantity" id="productQuantityId" class="form-control">
                    </div>

                    <div class="form-group">
                        <label>Color</label>
                        <input type="text" name="productColor" id="productColorId" class="form-control">
                    </div>

                    <div class="form-group">
                        <label>Description</label>
                        <textarea name="productDescription" id="productDescriptionId" class="form-control"></textarea>
                    </div>

                    <div class="form-group">
                        <input type="hidden" name="action" id="categoryId" value="create">
                        <label>Category</label>
                        <select name="categoryId" class="form-control">
                            <c:forEach var="category" items="${categoryList}">
                                <option value="${category.categoryId}">${category.categoryName}</option>
                            </c:forEach>
                        </select>
                    </div>

                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-info" value="Save">
                </div>
            </form>
        </div>
    </div>
</div>

<!-- Delete Modal HTML -->

<form action="/products" method="post">
    <div id="deleteModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">

                <input type="hidden" name="action" value="delete"/>
                <input type="hidden" id="idDeleteHidden" name="idDeleteHidden"/>

                <div class="modal-header">
                    <h4 class="modal-title">Delete Product</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>

                <div class="modal-body">
                    <p>Are you sure you want to delete these Records?</p>
                    <p class="text-warning"><small>This action cannot be undone.</small></p>
                </div>

                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-danger" value="Delete">
                </div>

            </div>
        </div>
    </div>
</form>

<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

<script>
    function setInfor(id, productName, productPrice, productQuantity, productColor, productDescription, categoryId) {
        document.getElementById("idEditHidden").value = id;
        document.getElementById("productNameId").value = productName;
        document.getElementById("productPriceId").value = productPrice;
        document.getElementById("productQuantityId").value = productQuantity;
        document.getElementById("productColorId").value = productColor;
        document.getElementById("productDescriptionId").value = productDescription;
        document.getElementById("categoryId").value = categoryId;
    }
</script>

<script>
    function setId(id) {
        document.getElementById("idDeleteHidden").value = id;
        // document.getElementById("idEditHidden").value = id;
    }
</script>

<script>
    $(document).ready(function () {
        $('#table').dataTable({
            // "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>

<script>
    if (window.history.replaceState) {
        window.history.replaceState(null, null, window.location.href);
    }
</script>

</body>
</html>