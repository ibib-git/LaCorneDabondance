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
        <a href="product-pomme">
            <div>
                <img class="image-product" src='<spring:url value="/images/pomme.png"/>' alt="pommeIcon">
                <h3>${apple}</h3>
            </div>
        </a>
        <a href="product-poirre">
            <div>
                <img class="image-product" src='<spring:url value="/images/poire.png"/>' alt="poireIcon">
                <h3>Poire</h3>
            </div>
        </a>
        <a href="product-mure">
            <div>
                <img class="image-product" src='<spring:url value="/images/mure.png"/>' alt="mureIcon">
                <h3>Mure</h3>
            </div>
        </a>
        <a href="product-fraise">
            <div>
                <img class="image-product" src='<spring:url value="/images/fraise.png"/>' alt="fraiseIcon">
                <h3>Fraise</h3>
            </div>
        </a>


    </div>

</div>


</body>
</html>