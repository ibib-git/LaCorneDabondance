<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp" %>
<html lang="fr">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
</head>
<body>
<!--Container-->

<div class="container-title">
    <h1>Categorie</h1>
    <p><h2>Fruits</h2></p>

    <div class="flex-container">

        <c:forEach items="${productsListing}" var="product">

            <a href="product-fraise">
                <div>
                    <img class="image-product" src='<spring:url value="/images/${product.getPhotoLink()}"/>' alt="productIcon">
                    <h3>${product.getName()}</h3>
                </div>
            </a>


        </c:forEach>
        <div>


        </div>

    </div>

</div>



</body>
</html>