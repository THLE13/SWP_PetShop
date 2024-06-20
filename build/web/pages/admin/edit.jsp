<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Edit Product</title>
        <style>
            .form-container {
                max-width: 600px;
                margin: auto;
            }

            .form-container form {
                border: 1px solid #ccc;
                background-color: #f2f2f2;
                padding: 20px;
            }

            .form-container form input[type=text],
            .form-container form input[type=number],
            .form-container form textarea {
                width: 100%;
                padding: 10px;
                margin: 5px 0 15px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }

            .form-container form input[type=submit] {
                background-color: #008CBA;
                color: white;
                padding: 12px 20px;
                border: none;
                cursor: pointer;
                width: 100%;
            }

            .form-container form input[type=submit]:hover {
                background-color: #004C6D;
            }

            .form-container h2 {
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div class="form-container">
            <h2>Edit Product</h2>
            <form action="${pageContext.request.contextPath}/editProduct" method="Post">
                <input type="number" name="productId" value="${product.productId}" readonly>

                <label for="productName">Product Name:</label>
                <input type="text" id="productName" name="productName" value="${product.productName}" required>

                <label for="imgProduct">Image URL:</label>
                <input type="text" id="imgProduct" name="imgProduct" value="${product.imgProduct}" required>

                <label for="priceProduct">Price:</label>
                <input type="number" id="priceProduct" name="priceProduct" value="${product.priceProduct}" min="0" step="0.01" required>

                <label for="typeProductId">Type Product ID:</label>
                <input type="number" id="typeProductId" name="typeProductId" value="${product.typeProductId}" required>

                <label for="sizeId">Size ID:</label>
                <input type="number" id="sizeId" name="sizeId" value="${product.sizeId}" required>

                <label for="trademarkId">Trademark ID:</label>
                <input type="number" id="trademarkId" name="trademarkId" value="${product.trademarkId}" required>

                <label for="quantity">Quantity:</label>
                <input type="number" id="quantity" name="quantity" value="${product.quantity}" min="0" required>

                <label for="dateAdded">Date Added:</label>
                <input type="date" id="dateAdded" name="dateAdded" value="${product.dateAdded}" required>

                <label for="describe_product">Description:</label>
                <textarea id="describe_product" name="describe_product" rows="4">${product.describe_product}</textarea>

                 <input type="submit" value="Save Changes">
            </form>
        </div>
    </body>
</html>
