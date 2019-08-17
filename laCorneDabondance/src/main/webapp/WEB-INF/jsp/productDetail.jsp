<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp" %>
<%@page contentType="text/html; charset=UTF-8" %>

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
            <h4> Variété : ${detailVariety}</h4>
            <p>${detailDesc}</p>
            <h4>Saison du ${detailSeasonStart} au ${detailSeasonEnd}</h4>
            <h4>Temps de conservation : ${detailLife} jours</h4>
            <h4>${detailPrice} €/Unité *</h4>
            <h6>Une unité correspond à une masse de 200 gr</h6>
            <c:choose>
                <c:when test="${detailQuant > 0}">

            <form:form action="/laCorneDabondance/products/addProduct" id="addProduct" method="post" modelAttribute="session">
               <form:label path="orderQuantity">Quantité :</form:label>
                <form:input path="orderQuantity" type="number"  name="quantity" value="${defaultValue}" min="1" max="${detailQuant}" id='inputCommand' />
                <form:button >Ajouter au panier</form:button>

            </form:form>
                </c:when>

                <c:when test="${idLineUpdate > 0}">
                    <form:form action="/laCorneDabondance/products/updateQuantProduct/${idLineUpdate}" id="updateQuantProduct" method="post" modelAttribute="session">
                        <form:label path="updateQuantity">Quantité :</form:label>
                        <form:input path="updateQuantity" type="number"  name="quantity" value="${defaultValue}" min="1" max="${detailQuant}" id='updateCommand' />
                        <form:button >Modifier la quantité dans le panier</form:button>

                    </form:form>

                </c:when>
                <c:otherwise><p>Produit indisponible</p></c:otherwise>
            </c:choose>
        </div>

        <form:form action="/laCorneDabondance/products/return" id="return" method="post" modelAttribute="session">
        <button class="cancelbtn" >Retour aux produits</button>
        </form:form>


    </div>


</div>




</body>
</html>