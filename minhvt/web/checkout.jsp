

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <title>Shop điện thoại</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>

        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="css/slick.css"/>
        <link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>

        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <script src="https://uhchat.net/code.php?f=2d81b4"></script>
        <!-- HEADER -->
        <header>
            <!-- TOP HEADER -->
            <div id="top-header">
                <div class="container">
                    <ul class="header-links pull-left">
                        <li><a href="#"><i class="fa fa-phone"></i> +84 334 255 377</a></li>
                        <li><a href="#"><i class="fa fa-envelope-o"></i> ducntps10576@fpt.edu.vn</a></li>
                        <li><a href="#"><i class="fa fa-map-marker"></i> 74 Hàn Hải Nguyên Q.11</a></li>
                    </ul>
                    <ul class="header-links pull-right">
                        <li><a href="#"><i class="fa fa-dollar"></i> USD</a></li>
                            <c:set var="check" value="${sessionScope.QWER}"/>
                            <c:choose>
                                <c:when test="${check == 'DangNhapCheckOut'}">
                                    <c:set var="ten" value="${sessionScope.TEN}"/>
                                    <c:if test="${ten != null}">
                                    <li><a href="#">Xin chào ${ten.getHoTen()}</a></li>
                                    <form action="ControllerCart" method="POST" style="display: inline-table;">
                                        <li><i class="fa fa-user-o"></i>
                                            <button style="border: none; background-color: transparent; 
                                                    color: white; font-size: 13.2px; font-family: arial; margin-left: -5px;" 
                                                    type="submit" name="action" value="DangXuatCheckOut">Đăng xuất</button></li>
                                    </form>
                                </c:if>
                                <c:if test="${ten == null}">
                                    <form action="ControllerCart" method="POST" style="display: inline-table;">
                                        <li><i class="fa fa-user-o"></i>
                                            <button style="border: none; background-color: transparent; 
                                                    color: white; font-size: 13.2px; font-family: arial; margin-left: -5px;" 
                                                    type="submit" name="action" value="DangNhapCheckOut">Đăng nhập</button></li>
                                    </form>
                                </c:if>
                            </c:when>
                            <c:when test="${check != 'DangNhapCheckOut'}">
                                <form action="ControllerCart" method="POST" style="display: inline-table;">
                                    <li><i class="fa fa-user-o"></i>
                                        <button style="border: none; background-color: transparent; 
                                                color: white; font-size: 13.2px; font-family: arial; margin-left: -5px;" 
                                                type="submit" name="action" value="DangNhapCheckOut">Đăng nhập</button></li>
                                </form>
                            </c:when>
                        </c:choose>
                    </ul>
                </div>
            </div>
            <!-- /TOP HEADER -->

            <!-- MAIN HEADER -->
            <div id="header">
                <!-- container -->
                <div class="container">
                    <!-- row -->
                    <div class="row">
                        <!-- LOGO -->
                        <div class="col-md-3">
                            <div class="header-logo">
                                <form action="ControllerCart" method="POST">
                                    <button style="background-color: transparent; border: none;" type="submit" name="action" value="Icheck"><img src="./img/logo.png" alt=""></button>
                                </form>
                            </div>
                        </div>
                        <!-- /LOGO -->

                        <!-- SEARCH BAR -->
                        <div class="col-md-6">
                            <div class="header-search">
                                <form>
                                    <select class="input-select">
                                        <option value="0">All Categories</option>
                                    </select>
                                    <input class="input" placeholder="Search here">
                                    <button class="search-btn">Search</button>
                                </form>
                            </div>
                        </div>
                        <!-- /SEARCH BAR -->
                    </div>
                    <!-- row -->
                </div>
                <!-- container -->
            </div>
            <!-- /MAIN HEADER -->
        </header>
        <!-- /HEADER -->

        <!-- NAVIGATION -->
        <nav id="navigation">
            <!-- container -->
            <div class="container">
                <!-- responsive-nav -->
                <div id="responsive-nav">
                    <!-- NAV -->
                    <ul class="main-nav nav navbar-nav">
                        <li class="active"><a href="index.jsp">Trang chủ</a></li>
                        <li><a href="store.jsp">Sản phẩm</a></li>
                        <li><a href="store.jsp">Oppo</a></li>
                        <li><a href="store.jsp">Apple</a></li>
                        <li><a href="store.jsp">Huawei</a></li>
                        <li><a href="store.jsp">SamSung</a></li>
                        <li><a href="store.jsp">Xiaomi</a></li>
                        <li><a href="map.jsp">Liên hệ</a></li>
                    </ul>
                    <!-- /NAV -->
                </div>
                <!-- /responsive-nav -->
            </div>
            <!-- /container -->
        </nav>
        <!-- /NAVIGATION -->

        <!-- BREADCRUMB -->
        <div id="breadcrumb" class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">
                    <div class="col-md-12">
                        <h3 class="breadcrumb-header">Thanh toán</h3>
                        <ul class="breadcrumb-tree">
                            <li><a href="index.jsp">Home</a></li>
                            <li class="active">Thanh toán</li>
                        </ul>
                    </div>
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /BREADCRUMB -->

        <!-- SECTION -->
        <div class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">
                    <form action="ControllerCart" method="POST">
                        <div class="col-md-7">
                            <!-- Billing Details -->
                            <div class="billing-details">
                                <div class="section-title">
                                    <h3 class="title">Hóa đơn</h3>
                                </div>
                                <div class="form-group">
                                    <div style="padding-bottom: 10px;">Họ tên *</div>
                                    <input class="input" type="text" name="txtHoTen" value="${ten.getHoTen()}" placeholder="Họ tên" required="required">
                                </div>
                                <div class="form-group">
                                    <div style="padding-bottom: 10px; padding-top: 10px;">Số điện thoại *</div>
                                    <input class="input" type="tel" name="txtSoDT" value="${ten.getSoDT()}" placeholder="Số điện thoại" required="required">
                                </div>
                                <div class="form-group">
                                    <div style="padding-bottom: 10px; padding-top: 10px;">Email *</div>
                                    <input class="input" type="email" name="txtEmail" value="${ten.getEmail()}" placeholder="Email" required="required">
                                </div>
                                <div class="form-group">
                                    <div style="padding-bottom: 10px; padding-top: 10px;">Địa chỉ *</div>
                                    <textarea style="width: 100%; border: 1px solid #E4E7ED; padding: 10px 15px;" rows="7" cols="1" name="txtDiaChi" placeholder="Địa chỉ" required="required">${ten.getDiaChi()}</textarea>
                                </div>
                            </div>
                            <!-- /Billing Details -->
                        </div>

                        <!-- Order Details -->
                        <div class="col-md-5 order-details">
                            <div class="section-title text-center">
                                <h3 class="title">Hóa đơn thanh toán</h3>
                            </div>
                            <div class="order-summary">
                                <div class="order-col">
                                    <div><strong>Sản phẩm</strong></div>
                                    <div><strong>Giá</strong></div>
                                </div>
                                <c:set var="tien" value="0"/>
                                <div class="order-products">
                                    <c:set var="shop" value="${sessionScope.SHOP}"/>
                                    <c:if test="${not empty shop}">
                                        <c:forEach var="rows" items="${shop}">
                                            <div class="order-col">
                                                <div>${rows.value.getSoLuong()}x ${rows.value.getSanPham().getTenSP()}</div>
                                                <div>$${rows.value.getSanPham().getGia()}</div>
                                                <c:set var="tien" value="${tien + (rows.value.getSanPham().getGia() * rows.value.getSoLuong())}"/>
                                            </div>
                                        </c:forEach>
                                    </c:if>
                                </div>
                                <div class="order-col">
                                    <div>Shiping</div>
                                    <div><strong>Miễn phí</strong></div>
                                </div>
                                <div class="order-col">
                                    <div><strong>Tổng cộng</strong></div>
                                    <div><strong class="order-total">$${tien}</strong></div>
                                </div>
                            </div>
                            <div class="payment-method">
                                <div class="input-radio">
                                    <input type="radio" name="payment" id="payment-1" checked="">
                                    <label for="payment-1">
                                        <span></span>
                                        Chuyển khoản ngân hàng
                                    </label>
                                </div>
                                <div class="input-radio">
                                    <input type="radio" name="payment" id="payment-2">
                                    <label for="payment-2">
                                        <span></span>
                                        Thu phí tại nhà
                                    </label>
                                </div>
                                <div class="input-radio">
                                    <input type="radio" name="payment" id="payment-3">
                                    <label for="payment-3">
                                        <span></span>
                                        Ví điện tử MoMo, PayPal
                                    </label>
                                </div>
                            </div>
                            <div class="input-checkbox">
                                <input type="checkbox" id="terms" checked="">
                                <label for="terms">
                                    <span></span>
                                    Tôi đã đọc và chấp nhận mọi điều khoản</a>
                                </label>
                            </div>
                            <input type="submit" name="action" value="Đặt hàng" class="primary-btn order-submit" style="width: 100%;">
                            <input type="hidden" name="txtTien" value="${tien}">
                            <input type="hidden" name="txtMaKH5" value="${ten.getMaKH()}">
                        </div>
                        <!-- /Order Details -->
                    </form>
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /SECTION -->

        <!-- NEWSLETTER -->
        <div id="newsletter" class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="newsletter">
                            <p>Sign Up for the <strong>NEWSLETTER</strong></p>
                            <form>
                                <input class="input" type="email" placeholder="Enter Your Email">
                                <button class="newsletter-btn"><i class="fa fa-envelope"></i> Subscribe</button>
                            </form>
                            <ul class="newsletter-follow">
                                <li>
                                    <a href="#"><i class="fa fa-facebook"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-twitter"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-instagram"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-pinterest"></i></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /NEWSLETTER -->

        <!-- FOOTER -->
        <footer id="footer">
            <!-- top footer -->
            <div class="section">
                <!-- container -->
                <div class="container">
                    <!-- row -->
                    <div class="row">
                        <div class="col-md-3 col-xs-6">
                            <div class="footer">
                                <h3 class="footer-title">About Us</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.</p>
                                <ul class="footer-links">
                                    <li><a href="#"><i class="fa fa-map-marker"></i>74 Hàn Hải Nguyên Q.11</a></li>
                                    <li><a href="#"><i class="fa fa-phone"></i>+84 334 255 377</a></li>
                                    <li><a href="#"><i class="fa fa-envelope-o"></i>ducntps10576@fpt.edu.vn</a></li>
                                </ul>
                            </div>
                        </div>

                        <div class="col-md-3 col-xs-6">
                            <div class="footer">
                                <h3 class="footer-title">Categories</h3>
                                <ul class="footer-links">
                                    <li><a href="#">Hot deals</a></li>
                                    <li><a href="#">Laptops</a></li>
                                    <li><a href="#">Smartphones</a></li>
                                    <li><a href="#">Cameras</a></li>
                                    <li><a href="#">Accessories</a></li>
                                </ul>
                            </div>
                        </div>

                        <div class="clearfix visible-xs"></div>

                        <div class="col-md-3 col-xs-6">
                            <div class="footer">
                                <h3 class="footer-title">Information</h3>
                                <ul class="footer-links">
                                    <li><a href="#">About Us</a></li>
                                    <li><a href="#">Contact Us</a></li>
                                    <li><a href="#">Privacy Policy</a></li>
                                    <li><a href="#">Orders and Returns</a></li>
                                    <li><a href="#">Terms & Conditions</a></li>
                                </ul>
                            </div>
                        </div>

                        <div class="col-md-3 col-xs-6">
                            <div class="footer">
                                <h3 class="footer-title">Service</h3>
                                <ul class="footer-links">
                                    <li><a href="#">My Account</a></li>
                                    <li><a href="#">View Cart</a></li>
                                    <li><a href="#">Wishlist</a></li>
                                    <li><a href="#">Track My Order</a></li>
                                    <li><a href="#">Help</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <!-- /row -->
                </div>
                <!-- /container -->
            </div>
            <!-- /top footer -->

            <!-- bottom footer -->
            <div id="bottom-footer" class="section">
                <div class="container">
                    <!-- row -->
                    <div class="row">
                        <div class="col-md-12 text-center">
                            <ul class="footer-payments">
                                <li><a href="#"><i class="fa fa-cc-visa"></i></a></li>
                                <li><a href="#"><i class="fa fa-credit-card"></i></a></li>
                                <li><a href="#"><i class="fa fa-cc-paypal"></i></a></li>
                                <li><a href="#"><i class="fa fa-cc-mastercard"></i></a></li>
                                <li><a href="#"><i class="fa fa-cc-discover"></i></a></li>
                                <li><a href="#"><i class="fa fa-cc-amex"></i></a></li>
                            </ul>
                            <span class="copyright">
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            </span>
                        </div>
                    </div>
                    <!-- /row -->
                </div>
                <!-- /container -->
            </div>
            <!-- /bottom footer -->
        </footer>
        <!-- /FOOTER -->
        <!-- jQuery Plugins -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>

