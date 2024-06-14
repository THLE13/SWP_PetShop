create database SWP_Pshop;
use SWP_Pshop;

-- Table for customer type
CREATE TABLE typecustomer (
    typecustomerId INT  identity(1,1) PRIMARY KEY,
    typecustomerName VARCHAR(255) NOT NULL
);

-- Table for customers
CREATE TABLE customer (
    customerId INT  identity(1,1) PRIMARY KEY,
    customerName VARCHAR(255) NOT NULL,
    customerDob VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL UNIQUE,
    password_ VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    phoneNumber VARCHAR(20) NOT NULL,
    address_ VARCHAR(255),
    img_ava VARCHAR(255),
    description_C TEXT,
    typecustomerId INT,
    FOREIGN KEY (typecustomerId) REFERENCES typecustomer(typecustomerId),
);

-- Table for roles
CREATE TABLE role (
    roleId INT  identity(1,1) PRIMARY KEY,
    roleName VARCHAR(255) NOT NULL
);

-- Table for employees
CREATE TABLE employee (
    employeeId INT PRIMARY KEY,
    employeeName VARCHAR(255) NOT NULL,
    employeeDob VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL UNIQUE,
    password_ VARCHAR(255) NOT NULL,
    phoneNumber VARCHAR(20) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    img_ava VARCHAR(255),
    description_ TEXT,
    roleId INT,
    FOREIGN KEY (roleId) REFERENCES role(roleId)
);

-- Table for product types
CREATE TABLE typeProduct (
    typeProductId INT  identity(1,1) PRIMARY KEY,
    typeProductName VARCHAR(255) NOT NULL,
    describeType TEXT
);

-- Table for sizes
CREATE TABLE size (
    sizeId INT  identity(1,1) PRIMARY KEY,
    sizeName VARCHAR(255) NOT NULL,
    weight_ VARCHAR(255)
);

-- Table for trademarks
CREATE TABLE trademark (
    trademarkId INT  identity(1,1)  PRIMARY KEY,
    trademarkName VARCHAR(255) NOT NULL,
    logo VARCHAR(255),
    descriptionTrademark TEXT
);

-- Table for products
CREATE TABLE product (
    productId INT  identity(1,1) PRIMARY KEY,
    productName VARCHAR(255) NOT NULL,
    img VARCHAR(255), 
    priceProduct DECIMAL(10, 2) NOT NULL,
    typeProductId INT,
    sizeId INT,
    trademarkId INT,
    quantity INT NOT NULL,
    dateAdded DATE NOT NULL,
    describe_product TEXT,
    FOREIGN KEY (typeProductId) REFERENCES typeProduct(typeProductId),
    FOREIGN KEY (sizeId) REFERENCES size(sizeId),
    FOREIGN KEY (trademarkId) REFERENCES trademark(trademarkId)
);

-- Table for payments
CREATE TABLE payment (
    paymentId INT  identity(1,1) PRIMARY KEY,
    typePayment VARCHAR(255) NOT NULL
);

-- Table for vouchers
CREATE TABLE voucher (
    code VARCHAR(255) PRIMARY KEY,
    sale DECIMAL(5, 2) NOT NULL,
    regulationNo VARCHAR(255)
);

-- Table for transport
CREATE TABLE transport (
    transportId INT  identity(1,1) PRIMARY KEY,
    transportName VARCHAR(255) NOT NULL,
    priceTransPort DECIMAL(10, 2) NOT NULL,
    description_transport TEXT
);

-- Table for bill sale
CREATE TABLE billSale (
    billSaleId INT  identity(1,1)  PRIMARY KEY,
    dateTime_ DATETIME NOT NULL,
    customerId INT,
    status_ VARCHAR(255) NOT NULL,
    voucherCode VARCHAR(255),
    vat DECIMAL(5, 2) NOT NULL,
    transportId INT,
    paymentId INT,
	employeeId INT,
	FOREIGN KEY (employeeId) REFERENCES employee(employeeId),
    FOREIGN KEY (customerId) REFERENCES customer(customerid),
    FOREIGN KEY (voucherCode) REFERENCES voucher(code),
    FOREIGN KEY (transportId) REFERENCES transport(transportId),
    FOREIGN KEY (paymentId) REFERENCES payment(paymentId)
);

-- Table for bill details
CREATE TABLE billDetail (
    billDetailId INT  identity(1,1),
    productId INT,
    quantity INT NOT NULL,
    billSaleId INT,
    priceBillDetail DECIMAL(10, 2),
    PRIMARY KEY (billDetailId, productId),
    FOREIGN KEY (productId) REFERENCES product(productId),
    FOREIGN KEY (billSaleId) REFERENCES billSale(billSaleId)
);


-- Table for ratings
CREATE TABLE rating (
    ratingId INT identity(1,1) PRIMARY KEY,
    productId INT,
    customerId INT,
    startQuantity INT NOT NULL,
    content TEXT,
    FOREIGN KEY (productId) REFERENCES product(productId),
    FOREIGN KEY (customerId) REFERENCES customer(customerid)
);


