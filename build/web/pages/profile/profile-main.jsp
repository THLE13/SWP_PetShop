<%-- Document : profile-main.jsp Created on : 8 thg 6, 2024, 16:07:09 Author :
longle2507 --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="../../css/profile/profile-style.css" />
    <title>Profile</title>
  </head>
  <body>
    <header class="app-header">
      <div class="container d-flex align-items-center justify-content-between">
        <div class="intro-page">
            <h3 class="text-heading text-uppercase"><a href="../../index.jsp">PetShop</a></h3>
        </div>
        <div
          class="wrapper-infor d-flex align-items-center justify-content-between"
        >
          <div class="img-user me-3">
            <img
              src="../../assets/images/intro-begin/intro.jpg"
              alt="User Image"
            />
          </div>
          <div class="name-user d-flex flex-column">
            <div class="widget-heading">LongBuaDinh</div>
            <div class="widget-subheading">User Profile</div>
          </div>
        </div>
      </div>
    </header>

    <!-- welcome-user-section -->
    <div class="welcome-part">
      <section class="welcome-content">
        <div class="container">
          <div class="main-content">
            <div class="name-user">
              <h2>Hello, <span>LongBuaDinh</span></h2>
            </div>
            <div class="intro-section">
              <p>
                Welcome back to PShop, this is your profile. You can edit your
                profile right here, click "Edit Profile" to edit. Thanks
              </p>
            </div>
            <div class="btn-edit-profile">
              <button onclick="" class="">Edit Profile</button>
            </div>
          </div>
        </div>
      </section>
    </div>

    <!-- account-details -->
    <section class="account-details py-5">
      <div class="container">
        <div class="card-information p-4">
          <div class="img-user text-center mb-4">
            <img
              src="../../assets/images/intro-begin/intro.jpg"
              alt="User Image"
            />
          </div>
          <div class="wrapper-input">
            <div class="input-content mb-3">
              <label for="user-name" class="form-label">User Name</label>
              <input type="text" class="form-control" value="LongBuaDinh" />
            </div>
            <div class="input-content mb-3">
              <label for="user-email" class="form-label">Email</label>
              <input
                type="email"
                class="form-control"
                value="daudinhvuotkeo03@gmail.com"
              />
            </div>
            <div class="input-content mb-3">
              <label for="user-phone" class="form-label">Phone Number</label>
              <input type="tel" class="form-control" value="0587107407" />
            </div>
            <div class="input-content mb-3">
              <label for="user-address" class="form-label">Address</label>
              <input
                type="text"
                class="form-control"
                value="K88/48 Nguyễn Đức Trung, Đà Nẵng"
              />
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
              <li><span>Email: </span> fshopbuadinh@gmail.com</li>
              <li><span>Hotline: </span> 0123456789</li>
            </ul>
          </div>
          <div class="col-md-3 text-center d-flex justify-content-between">
            <a
              ><img
                src="../../assets/images/social-icon/facebook_e3e340acee344ebd8bb196d37d0cef87.webp"
                class="img-fluid"
                alt=""
                width="30"
                height="30"
            /></a>
            <a
              ><img
                src="../../assets/images/social-icon/momo_logo_63183e1975424c0aade4b84e605ae0a2.webp"
                class="img-fluid"
                alt=""
                width="30"
                height="30"
            /></a>
            <a
              ><img
                src="../../assets/images/social-icon/shoppe-pay.webp"
                class="img-fluid"
                alt=""
                width="30"
                height="30"
            /></a>
            <a
              ><img
                src="../../assets/social-icon/vnp_322d4deedfa64e64a03900c8341c0317.webp"
                class="img-fluid"
                alt=""
                width="30"
                height="30"
            /></a>
          </div>
        </div>
        <div class="footer-bottom">
          <span
            >Copyright © 2024 Fshop & Freelancers. Powered by
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
    <script src="../../assets/js/profile/profile-script.js"></script>
  </body>
</html>
