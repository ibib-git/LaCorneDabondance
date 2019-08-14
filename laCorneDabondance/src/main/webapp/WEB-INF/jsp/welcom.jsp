<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp" %>
<html lang="fr">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
</head>
<body>
<div class="container-title">
    <h1>Accueil</h1>
    <p><h2>Produits du moment</h2></p>

    <div class="flex-container">
        <a href="<spring:url value='/products/detail/${welcomFruitsId}'  />">
            <div class="product-back">
                <h3>${welcomFruitsName}</h3>
                <img class="image-product" src='<spring:url value="/images/${welcomFruitsImage}"/>' alt="welcomFruit">
                <p> ${welcomFruitsDescription} </p> </div>
        </a>
        <a href="<spring:url value='/products/detail/${welcomLegumeId}'  />">
            <div class="product-back">
                <h3>${welcomLegumeName}</h3>
                <img class="image-product" src='<spring:url value="/images/${welcomLegumeImage}"/>' alt="welcomLegume">
                <p> ${welcomLegumeDescription} </p> </div>
        </a>
    </div>

</div>

</body>
</html>