<%-- Document : support Created on : 24 thg 5, 2024, 12:43:11 Author :
longle2507 --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
            />
        <link rel="stylesheet" href="../../css/for_service/serviceStyle.css" />
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
            crossorigin="anonymous"
            />
        <link
            rel="shortcut icon"
            href="./img/intro-begin/intro.jpg"
            type="image/x-icon"
            />
        <title>Dịch vụ giao hàng</title>
    </head>
    <body>
        <header class="header">
            <div class="container-fluid">
                <div class="row align-items-center">
                    <!-- Hambuger Icon -->
                    <div class="col-md-3 col py-3 logo d-flex align-items-center">
                        <a
                            href="#hambuger"
                            class="hambuger-logo d-md-none d-flex justify-content-start"
                            >
                            <i class="fas fa-bars"></i>
                        </a>
                        <a
                            href="../../index.jsp"
                            class="logo-text d-flex justify-content-center"
                            >
                            <i class="fab fa-paypal"><b>shop</b></i>
                            <i class="fas fa-paw"></i>
                        </a>
                    </div>

                    <div
                        class="col-md-6 py-3 nav text-center d-none d-md-flex justify-content-between"
                        >
                        <a
                            href="./page/list-product-page.html"
                            class="nav-item text-uppercase"
                            >new collection</a
                        >
                        <a
                            class="nav-item text-uppercase dropdown-toggle"
                            href="#"
                            id="navbarDropdown"
                            role="button"
                            data-bs-toggle="dropdown"
                            aria-expanded="false"
                            >fshop</a
                        >
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="#">Áo</a></li>
                            <li><a class="dropdown-item" href="#">Quần</a></li>
                            <li><a class="dropdown-item" href="#">Áo khoác</a></li>
                        </ul>
                        <a href="#freeLance" class="nav-item text-uppercase"
                           >freelance[for her]</a
                        >
                        <a
                            href="./page/list-store-page.html"
                            class="nav-item text-uppercase"
                            >store</a
                        >
                    </div>

                    <!-- Social Icons -->
                    <div
                        class="col-md-3 col py-3 social-icons text-end d-flex justify-content-end"
                        >
                        <a href="#search" class="me-3" id="search-icon">
                            <i class="fa-solid fa-magnifying-glass"></i>
                        </a>
                        <a href="#user" class="me-3" id="user-icon">
                            <i class="fa-solid fa-user"></i>
                        </a>
                        <a href="#heart" class="me-3">
                            <i class="fa-regular fa-heart"></i>
                        </a>
                        <a href="#cart">
                            <i class="fa-solid fa-cart-shopping"></i>
                        </a>
                    </div>
                </div>
            </div>
        </header>

        <!-- content -->
        <section class="main-content">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="text-heading">Chính sách vận chuyển</h1>
                        <div class="content-details">
                            <div class="content">
                                <h3>1/Chính sách áp dụng</h3>
                                <p>
                                    Áp dụng với hệ thống Paddy và các tỉnh thành trên toàn Việt Nam
                                </p>
                            </div>
                            <div class="content">
                                <h3>2/Thời Gian Nhận Hàng</h3>
                                <p>
                                    PetShop giao hàng hoả tốc trong ngày với các khách hàng trong TP Hồ Chí Minh và bán kính đến các chi nhánh của Paddy dưới 15 km. Khoảng cách lớn hơn nhân viên của chúng tôi sẽ tư vấn cách thức giao hàng thuận tiện nhất cho khách hàng

                                </p>
                                <table>
                                    <tr>
                                        <th>
                                            Khoảng cách từ khách hàng đến Cửa Hàng PetShop
                                        </th>
                                        <th>TP. HCM</th>
                                        <th>Tỉnh thành khác</th>
                                    </tr>
                                    <tr>
                                        <td>Dưới 5km</td>
                                        <td>Giao trong 30 phút</td>
                                        <td>Giao trong 45 phút</td>
                                    </tr>
                                    <tr>
                                        <td>5-10km</td>
                                        <td>Giao trong 2 tiếng</td>
                                        <td>Giao trong 4 tiếng</td>
                                    </tr>
                                    <tr>
                                        <td>10km-20km</td>
                                        <td>Giao trong 24 tiếng</td>
                                        <td>Giao trong 36 tiếng</td>
                                    </tr>
                                    <tr>
                                        <td>Lưu ý</td>
                                        <td>Thời gian giao hàng 9:00 đến 21:00</td>
                                        <td>Thời gian giao hàng 9:00 đến 20:00</td>
                                    </tr>
                                    <tr>
                                        <td rowspan="3">
                                            Riêng đối với đơn hàng chọn phương thức vận chuyển tiết kiệm, sản phẩm sẽ được giao sớm nhất là 03 ngày sau khi đặt đối với các tỉnh thành không phải là TP Hồ Chí Minh
                                        </td>
                                    </tr>
                                </table>
                            </div>
                            <div class="content">
                                <h3>3/Chi phí giao hàng</h3
                                <p>
                                    Đối với đơn hàng tại TPHCM với giá trị giá 499.000đ trở xuống, phí giao hàng áp dụng: 29.000đ, đơn hàng trên 499.000đ Paddy sẽ giao hàng MIỄN PHÍ nội thành TPHCM                                </p>
                                <p>
                                    +Đối với các đơn hàng đi Tỉnh với giá trị giá 499.000đ trở xuống, phí giao hàng áp dụng: 35.000đ, đơn hàng trên 499.000đ Paddy sẽ giao hàng MIỄN PHÍ 
                                </p>
                                <p>
                                    + Nếu khoảng cách giao hàng lớn hơn 20 km tổng đài 0374414142 sẽ tư vấn cách thức giao hàng MIỄN PHÍ thuận tiện nhất cho khách hàng.
                                </p>
                            </div>
                            <div class="content">
                                <h3>4/ Các Lưu Ý Về Vận Chuyển</h3>
                                <ul>
                                    <li>
                                        Áp dụng theo chính sách giao hàng nội thành thông qua các đối tác giao hàng như GRAB, AHAMOVE… Nội thành là bao gồm các Quận, không bao gồm Huyện, Xã. 
                                    </li>
                                    <li>
                                        Thời gian giao hàng nội thành TP HCM tối đa trong vòng 48 giờ tính từ lúc quý khách xác nhận đặt mua hàng.
                                    </li>
                                    <li>
                                        Khách hàng có thể thanh toán trực tiếp hoặc chuyển khoản qua ngân hàng. Với một số đơn hàng khác có thể thanh toán sau khi nhận hàng.
                                    </li>
                                    <li>
                                        Phí vận chuyển chưa bao gồm <b>10%</b> VAT và phí dịch vụ COD nếu giá trị đơn hàng trên <b>2,000,000₫</b> (tùy theo quy định của mỗi bên đối tác giao hàng).
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <footer class="footer">
            <div class="container">
                <div class="row align-items-center footer-content">
                    <div class="col-md-3 py-3">
                        <div class="logo">
                            <i class="fa-thin fa-f"><b>pet</b> <i class="fas fa-paw"></i></i>
                        </div>
                    </div>
                    <div class="col-md-6 py-3 footer-content1">
                        <ul>
                            <li>
                                <span>CÃ´ng Ty: </span> TNHH T.M.G MÃ£ Sá» Thuáº¿: 0302966294
                            </li>
                            <li>
                                <span>Äá»a chá»: </span> 88 Nguyá»n Äá»©c Trung, PhÆ°á»ng Thanh
                                KhÃª ÄÃ´ng, Quáº­n Thanh KhÃª, TP. ÄN
                            </li>
                            <li><span>Email: </span> fshopbuadinh@gmail.com</li>
                            <li><span>Hotline: </span> 0123456789</li>
                        </ul>
                    </div>
                    <div class="col-md-3 text-center d-flex justify-content-between">
                        <a
                            ><img
                                src="../../img/footer-logo/facebook_e3e340acee344ebd8bb196d37d0cef87.webp"
                                class="img-fluid"
                                alt=""
                                width="30"
                                height="30"
                                /></a>
                        <a
                            ><img
                                src="../../img/footer-logo/momo_logo_63183e1975424c0aade4b84e605ae0a2.webp"
                                class="img-fluid"
                                alt=""
                                width="30"
                                height="30"
                                /></a>
                        <a
                            ><img
                                src="../../img/footer-logo/shoppe-pay.webp"
                                class="img-fluid"
                                alt=""
                                width="30"
                                height="30"
                                /></a>
                        <a
                            ><img
                                src="../../img/footer-logo/vnp_322d4deedfa64e64a03900c8341c0317.webp"
                                class="img-fluid"
                                alt=""
                                width="30"
                                height="30"
                                /></a>
                    </div>
                </div>
                <div class="footer-bottom">
                    <span
                        >Copyright Â© 2024 Fshop & Freelancers. Powered by
                        <a href="https://fpt.com/">FPT</a>.</span
                    >
                </div>
            </div>
        </footer>
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"
        ></script>
    </body>
</html>
