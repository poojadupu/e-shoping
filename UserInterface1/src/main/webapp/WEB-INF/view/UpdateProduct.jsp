<%@ page language="java" contentType="text/html"%>
<%@include file="Header.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">


<form action="<c:url value="/UpdateProduct"/>" method="post">
<table align="center" class="table table-bordered">
   <tr class="Success">
    <td colspan="2">
        <center><h3>Product</h3></center>
    </td>
    <tr class="active">
      <td> Product ID </td>
      <td><input type="text" name="cID" value="${product.productId}" readonly/></td>
     </tr>
    <tr class="active">
      <td> Product Name </td>
      <td><input type="text" name="cName" value="${product.productName}"/></td>
     </tr>
     <tr class="active">
       <td> Product Description </td>
      <td><input type="text" name="cDesc" value="${product.productDesc}"/></td>
     </tr>
     <tr class="warning">
       <td colspan="2">
          <center><input type="submit" value="Update Product"/></center>
       </td>
      </tr>
</table>
</form>
</div>
</body>
</html>