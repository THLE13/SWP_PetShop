<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 20px;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
            background-color: white;
            border-radius: 8px;
            overflow: hidden;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        }
        table, th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
        img.product-image {
            max-width: 100px;
            max-height: 100px;
            border-radius: 4px;
        }
        .actions {
            display: flex;
            justify-content: center;
        }
        .actions a, .actions form {
            margin: 0 5px;
            text-decoration: none;
            color: #333;
        }
        .actions form input[type="submit"] {
            padding: 6px 12px;
            background-color: #f44336;
            color: white;
            border: none;
            cursor: pointer;
            border-radius: 4px;
        }
        .actions form input[type="submit"]:hover {
            background-color: #d32f2f;
        }
        .add-new-link {
            display: block;
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h2>Product List</h2>
    <table>
        <thead>
            <tr>
                <th>Product ID</th>
                <th>Product Name</th>
                <th>Image</th>
                <th>Price</th>
                <th>Type Product ID</th>
                <th>Size ID</th>
                <th>Trademark ID</th>
                <th>Quantity</th>
                <th>Date Added</th>
                <th>Description</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <!-- Loop through products fetched from servlet -->
            <c:forEach var="product" items="${products}">
                <tr>
                    <td>${product.productId}</td>
                    <td>${product.productName}</td>
                    <td><img src="${product.imgProduct}" class="product-image"></td>
                    <td>${product.priceProduct}</td>
                    <td>${product.typeProductId}</td>
                    <td>${product.sizeId}</td>
                    <td>${product.trademarkId}</td>
                    <td>${product.quantity}</td>
                    <td>${product.dateAdded}</td>
                    <td>${product.describe_product}</td>
                    <td class="actions">
                        <a href="${pageContext.request.contextPath}/loadInforProduct?productId=${product.productId}">Edit</a> | 
                        <form action="${pageContext.request.contextPath}/deleteProduct" method="post" style="display: inline;">
                            <input type="hidden" name="productId" value="${product.productId}">
                            <input type="submit" value="Delete" onclick="return confirm('Are you sure you want to delete this product?');">
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="pages/admin/addProduct.jsp" class="add-new-link">Add New Product</a>
</body>
</html>
