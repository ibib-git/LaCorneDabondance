<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp" %>
<html lang="fr">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
</head>
<body>
<!--Container-->

<div class="container-title">
    <h1>Detail du produit</h1>
    <p><h2>${detailName}</h2></p>

    <div class="flex-container">

        <div>

            <img class="image-product" src='<spring:url value="/images/${detailImage}"/>' alt="img-${detailName}">
            <h3>${detailScient}</h3>
            <h4>${detailVariety}</h4>
            <p>${detailDesc}</p>
            <h4>${detailPrice} €/Unité</h4>
            <form action="/action_page.php">
                Quantité : <input type="number" name="quantity" min="1" max="${detailQuant}"/>
                <input type="submit">
            </form>

        </div>


    </div>




</div>



</body>
</html>