<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Admin</title>
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
    />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="../../css/admin/admin.css" />
  </head>
  <body>
    <header class="app-header py-3">
      <div class="container d-flex justify-content-between align-items-center">
        <div class="header-left d-flex align-items-center">
          <!-- Logo -->
          <a href="#" id="logo" class="logo-text">
            <i class="fab fa-paypal"><b>shop</b></i>
            <i class="fas fa-paw"></i>
          </a>
          <!-- Search -->
          <div class="wrapper-search ms-3">
            <input type="search" placeholder="Search" />
            <button>
              <i class="fa-solid fa-magnifying-glass"></i>
            </button>
          </div>
        </div>
        <div class="header-right d-flex align-items-center">
          <div class="img-admin me-3">
            <a
              class="nav-item text-uppercase dropdown-toggle"
              href="#"
              id="navbarDropdown"
              role="button"
              data-bs-toggle="dropdown"
              aria-expanded="false"
              ><img
                src="../../assets/images/banner/dog_banner_1370x.webp"
                alt=""
            /></a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li>
                <img src="../../assets/images/banner/dog_banner_1370x.webp" />
              </li>
              <li><a class="dropdown-item" href="#">LongBuaDinh</a></li>
              <button class="btn-edit">Edit Profile</button>
            </ul>
          </div>
          <div class="name-role me-3">
            <div class="widget-heading">LongBuaDinh</div>
            <div class="widget-subheading">Manager Person</div>
          </div>
          <div class="button-widget d-flex align-items-center">
            <a id="calculator" class="me-3">
              <i class="fa-solid fa-calculator"></i>
            </a>
            <a id="to-do-list">
              <i class="fa-solid fa-calendar"></i>
            </a>
          </div>
        </div>
      </div>
    </header>

    <div class="to-do-list-form">
      <div class="title">
        <span>ToDoList</span>
        <i class="fa-solid fa-list-check"></i>
      </div>
      <div class="wrapper-content">
        <div class="wrapper-input">
          <input type="text" placeholder="Add Task" id="task" />
          <button onclick="addTask()">Add</button>
        </div>
        <div class="place-for-task">
          <ul class="taskList"></ul>
        </div>
      </div>
    </div>
    <section class="intro-page">
      <div class="row system">
        <div class="col-md-12 py-3 system-content">
          <a href="../../index.jsp">Trang Chủ</a>
          <span>/ Hệ thống cửa hàng của Pshop</span>
          <span>/ Admin </span>
        </div>
      </div>
    </section>
    <section class="navbar">
      <div class="container">
        <div class="row">
          <div class="navbar-selection d-flex flex-column">
            <div class="menu">
              <h3 class="text-headng text-start text-uppercase">Menu</h3>
              <div class="menu-content d-flex flex-column">
                <a class="py-2"
                  ><i class="fa-solid fa-rocket me-2"></i>Dashboard</a
                >
                <a class="py-2"><i class="fa-solid fa-pager me-2"></i>Pages</a>
              </div>
            </div>
            <div class="menu py-3">
              <h3 class="text-headng text-start text-uppercase">
                Product - Store
              </h3>
              <div class="menu-content d-flex flex-column">
                <a class="py-2"
                  ><i class="fa-brands fa-product-hunt me-2"></i>Product</a
                >
                <a href="../list/list-store.html" class="py-2"
                  ><i class="fa-solid fa-store"></i>Store</a
                >
              </div>
            </div>

            <div class="menu py-3">
              <h3 class="text-headng text-start text-uppercase">Person</h3>
              <div class="menu-content d-flex flex-column">
                <a class="py-2"><i class="fa-solid fa-user"></i>Customer</a>
                <a href="../list/list-store.html" class="py-2"
                  ><i class="fa-solid fa-person-walking"></i>Staff</a
                >
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

    <section class="user-list">
      <div class="container">
        <div class="row">
          <div class="listUser"></div>
        </div>
      </div>
    </section>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
    <script src="../../assets/js/admin/admin-script.js"></script>
  </body>
</html>
