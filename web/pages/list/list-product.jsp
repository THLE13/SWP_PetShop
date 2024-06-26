<%-- Document : index.jsp Created on : 24 thg 5, 2024, 07:44:15 Author :
longle2507 --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
    />
    <link rel="stylesheet" href="../css/list/list-product.css" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <title>PShop</title>
  </head>
  <body>
    <header class="header">
      <div class="container">
        <div class="row align-items-center">
          <div class="col-md-3 py-3 logo">
            <a
              href="../index.jsp"
              class="logo-text d-flex justify-content-center"
            >
              <i class="fab fa-paypal"><b>shop</b><i class="fas fa-paw"></i></i>
            </a>
          </div>

          <div
            class="col-md-6 py-3 nav text-center d-flex justify-content-between"
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
            >
              fshop
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="#">Áo</a></li>
              <li><a class="dropdown-item" href="#">Quần</a></li>
              <li><a class="dropdown-item" href="#">Áo Khoác</a></li>
            </ul>
            <a href="#freeLance" class="nav-item text-uppercase"
              >freelance[for her]</a
            >
            <a href="../pages/list-product.jsp" class="nav-item text-uppercase"
              >store</a
            >
          </div>

          <div class="col-md-3 py-3 social-icons text-end">
            <a href="#search" class="me-3" id="search-icon"
              ><i class="fa-solid fa-magnifying-glass"></i
            ></a>
            <a href="#user" class="me-3" id="user-icon"
              ><i class="fa-solid fa-user"></i
            ></a>
            <a href="#heart" class="me-3"
              ><i class="fa-regular fa-heart"></i
            ></a>
            <a href="#cart" class="cart"
              ><i class="fa-solid fa-cart-shopping"
                ><span id="showSum">0</span></i
              ></a
            >
          </div>
        </div>
      </div>
    </header>

    <div class="form-search">
      <p class="text-center">Tìm Kiếm</p>
      <hr />
      <form method="" class="text-center">
        <input
          type="text"
          class="search"
          id="search"
          placeholder="Tìm kiếm sản phẩm"
        />
        <a href="#search"><i class="fa-solid fa-magnifying-glass"></i></a>
      </form>
    </div>

    <div class="form-login">
      <p class="text-center">Đăng nhập</p>
      <hr />
      <form method="get" class="text-center">
        <input type="text" placeholder="Email" />
        <input type="text" placeholder="Password" />
        <button class="btn-login">GO</button>
        <a href="./page/login.html">Register</a>
      </form>
    </div>

    <!-- banner-hero-part -->
    <section class="banner-hero text-center py-5">
      <div class="container">
        <div class="row py-8">
          <div class="col">
            <img
              src="../assets/images/banner/banner-list1.jpg"
              class="img-fluid"
              alt="this is banner hero"
            />
            <img
              src="../assets/images/banner/banner-list2.avif"
              class="img-fluid"
              alt=""
            />
          </div>
        </div>
      </div>
    </section>
    <!-- new-collection-part -->
    <section class="new-collection">
      <div class="container">
        <h3 class="text-uppercase text-center">new collection</h3>
        <div class="row">
          <div class="col-md-12 nav-bar d-flex justify-content-between">
            <div class="nav-bar-left">
              <div class="dropdown">
                <button
                  class="btn btn-secondary dropdown-toggle"
                  type="button"
                  id="dropdownMenuButton1"
                  data-bs-toggle="dropdown"
                  aria-expanded="false"
                >
                  Giá sản phẩm
                </button>
                <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                  <li><a class="dropdown-item" href="#">Dưới 500</a></li>
                  <li>
                    <a class="dropdown-item" href="#">500.000 - 1.000.000</a>
                  </li>
                  <li>
                    <a class="dropdown-item" href="#">1.000.000</a>
                  </li>
                </ul>
              </div>
              <div class="dropdown">
                <button
                  class="btn btn-secondary dropdown-toggle"
                  type="button"
                  id="dropdownMenuButton2"
                  data-bs-toggle="dropdown"
                  aria-expanded="false"
                >
                  Thương hiệu
                </button>
                <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton2">
                  <li><a class="dropdown-item" href="">Pshop</a></li>
                </ul>
              </div>
              <div class="dropdown">
                <button
                  class="btn btn-secondary dropdown-toggle"
                  type="button"
                  id="dropdownMenuButton3"
                  data-bs-toggle="dropdown"
                  aria-expanded="false"
                >
                  Loại sản phẩm
                </button>
                <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton3">
                  <li><a class="dropdown-item" href="#">Cát Vệ Sinh</a></li>
                  <li><a class="dropdown-item" href="#">Dây Dắt</a></li>
                  <li><a class="dropdown-item" href="#">Dầu Thơm</a></li>
                  <li><a class="dropdown-item" href="#">Giường - Nệm</a></li>
                  <li><a class="dropdown-item" href="#">Phụ Kiện</a></li>
                  <li><a class="dropdown-item" href="#">Snack Cho Chó</a></li>
                  <li><a class="dropdown-item" href="#">Snack Cho Mèo</a></li>
                </ul>
              </div>
            </div>
            <div class="nav-bar-right">
              <div class="dropdown">
                <button
                  class="btn btn-secondary dropdown-toggle"
                  type="button"
                  id="dropdownMenuButton4"
                  data-bs-toggle="dropdown"
                  aria-expanded="false"
                >
                  Sắp xếp theo
                </button>
                <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton4">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li>
                    <a class="dropdown-item" href="#">Something else here</a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

    <!-- show-all-product-part -->
    <section class="show-all-product py-3">
      <div class="container">
        <ul
          class="list-unstyled row row-cols-1 row-cols-md-2 row-cols-lg-3 g-4 product-list"
        >
          <!-- Product -->
          <li class="col product" data-key="1">
            <div class="card h-80">
              <img
                src="../img/product/12_9d4a8a94-816b-47e9-9408-48c5b30eaac3_1066x.webp"
                class="card-img-top"
                alt="..."
              />
              <div class="card-body customer text-left customer">
                <h5 class="thuong-hieu">Paddy</h5>
                <p class="card-text">Áo cho cho mèo</p>
                <p class="price-product"><span class="money">500</span></p>
                <button class="btn-cart text-center" onclick="addToCart()">
                  Thêm vào giỏ hàng
                </button>
                <a
                  href="javascript:void(0)"
                  class="remove"
                  onclick="removeItem(1)"
                  ><i class="fa-solid fa-trash"></i
                ></a>
              </div>
            </div>
          </li>
          <li class="col product" data-key="2">
            <div class="card h-80">
              <img
                src="../img/product/12_9d4a8a94-816b-47e9-9408-48c5b30eaac3_1066x.webp"
                class="card-img-top"
                alt="..."
              />
              <div class="card-body customer">
                <h5 class="thuong-hieu">Paddy</h5>
                <p class="card-text">Áo cho cho mèo</p>
                <p class="price-product"><span class="money">600</span></p>
                <button class="btn-cart text-center" onclick="addToCart()">
                  Thêm vào giỏ hàng
                </button>
                <a
                  href="javascript:void(0)"
                  class="remove"
                  onclick="removeItem(2)"
                  ><i class="fa-solid fa-trash"></i
                ></a>
              </div>
            </div>
          </li>
          <li class="col product" data-key="3">
            <div class="card h-80">
              <img
                src="../img/product/12_9d4a8a94-816b-47e9-9408-48c5b30eaac3_1066x.webp"
                class="card-img-top"
                alt="..."
              />
              <div class="card-body customer">
                <h5 class="thuong-hieu">Paddy</h5>
                <p class="card-text">Áo cho cho mèo</p>
                <p class="price-product"><span class="money">1000</span></p>
                <button class="btn-cart text-center" onclick="addToCart()">
                  Thêm vào giỏ hàng
                </button>
                <a
                  href="javascript:void(0)"
                  class="remove"
                  onclick="removeItem(3)"
                  ><i class="fa-solid fa-trash"></i
                ></a>
              </div>
            </div>
          </li>
          <li class="col product" data-key="4">
            <div class="card h-80">
              <img
                src="../img/product/12_9d4a8a94-816b-47e9-9408-48c5b30eaac3_1066x.webp"
                class="card-img-top"
                alt="..."
              />
              <div class="card-body customer">
                <h5 class="thuong-hieu">Paddy</h5>
                <p class="card-text">Áo cho cho mèo</p>
                <p class="price-product"><span class="money">300</span></p>
                <button class="btn-cart text-center" onclick="addToCart()">
                  Thêm vào giỏ hàng
                </button>
                <a
                  href="javascript:void(0)"
                  class="remove"
                  onclick="removeItem(4)"
                  ><i class="fa-solid fa-trash"></i
                ></a>
              </div>
            </div>
          </li>
          <li class="col product" data-key="5">
            <div class="card h-80">
              <img
                src="../img/product/12_9d4a8a94-816b-47e9-9408-48c5b30eaac3_1066x.webp"
                class="card-img-top"
                alt="..."
              />
              <div class="card-body customer">
                <h5 class="thuong-hieu">Paddy</h5>
                <p class="card-text">Áo cho cho mèo</p>
                <p class="price-product"><span class="money">200</span></p>
                <button class="btn-cart text-center" onclick="addToCart()">
                  Thêm vào giỏ hàng
                </button>
                <a
                  href="javascript:void(0)"
                  class="remove"
                  onclick="removeItem(5)"
                  ><i class="fa-solid fa-trash"></i
                ></a>
              </div>
            </div>
          </li>
          <li class="col product" data-key="6">
            <div class="card h-80">
              <img
                src="../img/product/12_9d4a8a94-816b-47e9-9408-48c5b30eaac3_1066x.webp"
                class="card-img-top"
                alt="..."
              />
              <div class="card-body customer">
                <h5 class="thuong-hieu">Paddy</h5>
                <p class="card-text">Áo cho cho mèo</p>
                <p class="price-product"><span class="money">400</span></p>
                <button class="btn-cart text-center" onclick="addToCart()">
                  Thêm vào giỏ hàng
                </button>
                <a
                  href="javascript:void(0)"
                  class="remove"
                  onclick="removeItem(6)"
                  ><i class="fa-solid fa-trash"></i
                ></a>
              </div>
            </div>
          </li>
        </ul>
      </div>
      <div class="btn-bottom text-center text-uppercase">
        <button>Xem thêm sản phẩm</button>
      </div>
    </section>

    <div class="checkout">
      <h1>Cart</h1>
      <div class="listCart"></div>
      <div class="checkout-details">
        <div class="total">0</div>
        <div class="closeShopping">Close</div>
      </div>
    </div>
    <footer class="footer">
      <div class="container">
        <div class="row align-items-center footer-content">
          <div class="col-md-3 py-3">
            <div class="logo">
              <a
                href="../index.html"
                class="logo-text d-flex justify-content-center"
              >
                <i class="fab fa-paypal"
                  ><b>shop</b><i class="fas fa-paw"></i
                ></i>
              </a>
            </div>
          </div>
          <div class="col-md-6 py-3 footer-content1">
            <ul>
              <li><span>Công Ty: </span> TNHH T.M.G Mã Số Thuế: 0302966294</li>
              <li>
                <span>Địa chỉ: </span> 88 Nguyễn Đức Trung, Phường Thanh Khê
                Đông, Quận Thanh Khê, TP. ĐN
              </li>
              <li><span>Email: </span> pshopbuadinh@gmail.com</li>
              <li><span>Hotline: </span> 0123456789</li>
            </ul>
          </div>
          <div class="col-md-3 text-center d-flex justify-content-between">
            <a
              ><img
                src="../assets/images/social-icon/facebook_e3e340acee344ebd8bb196d37d0cef87.webp"
                class="img-fluid"
                alt=""
                width="30"
                height="30"
            /></a>
            <a
              ><img
                src="../assets/images/social-icon/momo_logo_63183e1975424c0aade4b84e605ae0a2.webp"
                class="img-fluid"
                alt=""
                width="30"
                height="30"
            /></a>
            <a
              ><img
                src="../assets/images/social-icon/shoppe-pay.webp"
                class="img-fluid"
                alt=""
                width="30"
                height="30"
            /></a>
            <a
              ><img
                src="../assets/images/social-icon/vnp_322d4deedfa64e64a03900c8341c0317.webp"
                class="img-fluid"
                alt=""
                width="30"
                height="30"
            /></a>
          </div>
        </div>
        <div class="footer-bottom">
          <span
            >Copyright © 2024 Pshop. Powered by
            <a href="https://fpt.com/">FPT</a>.</span
          >
        </div>
      </div>
    </footer>
    <div class="digital-social">
      <!-- support-throught-media -->
      <div class="col support-by-media p-2">
        <ul class="content">
          <li class="option">
            <img
              src="//theme.hstatic.net/1000141988/1000913105/14/Button-Digital-02.png?v=384"
              class="img-fluid"
            />
          </li>
          <li class="option">
            <img
              src="//theme.hstatic.net/1000141988/1000913105/14/Button-Digital-03.png?v=384"
              class="img-fluid"
            />
          </li>
          <li class="option">
            <img
              src="//theme.hstatic.net/1000141988/1000913105/14/Button-Digital-04.png?v=384"
              class="img-fluid"
            />
          </li>
        </ul>
        <button class="btn-content">
          <a id="support-icon">
            <i class="fa-solid fa-headset"></i>
            <p>Hỗ Trợ</p>
          </a>
        </button>
      </div>
    </div>

    <!-- ai-support-part -->
    <div class="col ai-support p-2">
      <script src="https://www.gstatic.com/dialogflow-console/fast/messenger/bootstrap.js?v=1"></script>
      <df-messenger
        intent="WELCOME"
        chat-title="PetShop-AI-Support"
        agent-id="23305d3b-4617-4eff-98c3-437a66536c06"
        language-code="en"
      ></df-messenger>
    </div>
    <script src="../assets/js/list-product.js"></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
