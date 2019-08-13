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
        <a href="product-pomme">
            <div class="product-back">
                <h3>${welcomFruitsName}</h3>
                <img class="image-product" src='<spring:url value="/images/${welcomFruitsImage}"/>' alt="welcomFruit">
                <p> ${welcomFruitsDescription} </div>
        </a>
        <a href="product-fenouil">
            <div class="product-back">
                <h3>Le fenouil</h3>
                <img class="image-product" src='<spring:url value="/images/fenouil.gif"/>' alt="fenouil">
                <p>Le terme « fenouil » s'applique à plusieurs taxons distincts de la famille des apiacées. En tout, près de 90 variétés de fenouil sont inscrites au catalogue européen des espèces.
                    C'est le fenouil commun que l'on utilise en cuisine. Son goût ressemble à celui de l'anis. On peut cuisiner toutes les parties de la plante : racines, feuilles et graines.
                    On peut le consommer cru, en salade, ou cuit. Le fenouil peut atteindre 2 mètres de haut. Ses fleurs jaunes réunies en ombelles apparaissent généralement en Août ou en Septembre.</p>
            </div>
        </a>
    </div>

</div>

</body>
</html>