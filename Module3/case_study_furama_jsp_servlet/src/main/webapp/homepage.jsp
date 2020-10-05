<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/2/2020
  Time: 8:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang chủ</title>
    <!-- CSS only -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <!-- JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
            integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
            integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
            crossorigin="anonymous"></script>
    <style>
        @media only screen  and (max-width: 1000px) {
            div.container-fluid {
                background-size: 100%;
            }
        }
    </style>
</head>
<body>
<div>
    <nav class="navbar navbar-expand-lg bg-light">
        <a class="navbar-brand" href="#">
            <img src="https://bahungbakery.com.vn/upload/hinhanh/2746200-2866.JPG" width="120" height="60" alt="Logo"
                 loading="lazy">
        </a>
    </nav>
</div>
<div class="container-fluid"
     style="background-image: url('https://www.marry.vn/wp-content/uploads/2015/10/21/Furama-Resort-Danang.jpg')">
    <nav class="navbar navbar-expand-lg navbar-dark bg-secondary ">
        <a class="navbar-brand" href="#">Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Employee</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Customer
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/customers?action=create">Add New Customer</a>
                        <a class="dropdown-item" href="/customers?action=view">List Customer</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/services?action=create">Service</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contract</a>
                </li>


            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
    <div class="container-fluid pt-5">
        <div class="row">
            <div class="col-3 px-0  vh-100 ">
                <div class="list-group">
                    <a href="#" class="list-group-item list-group-item-action list-group-item-primary">Primary item</a>
                    <a href="#" class="list-group-item list-group-item-action ">Primary item</a>
                    <a href="#" class="list-group-item list-group-item-action ">Primary item</a>
                    <a href="#" class="list-group-item list-group-item-action ">Primary item</a>
                    <a href="#" class="list-group-item list-group-item-action ">Primary item</a>
                </div>
            </div>
        </div>
    </div>
</div>
<div>
    <!-- Footer -->
    <footer class="page-footer font-small blue" style="background-color: antiquewhite">
        <!-- Copyright -->
        <div class="footer-copyright text-center py-3">© 2020 Copyright:
            <a href="https://furamavietnam.com/vi/"> Furama.com</a>
        </div>
    </footer>
</div>
</body>
</html>
