<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp" %>
<%@page contentType="text/html; charset=UTF-8" %>

<html lang="fr">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
</head>
<body>

<div class="container-title">
    <h2>Commande</h2>


    <div class="flex-container">

        <div class="test-table">
            <table>

                <tr>
                    <th>Nom du produit</th>
                    <th>Prix unitaire avec réduction (€)</th>
                    <th>Quantité</th>
                    <th>Total (€)</th>
                </tr>

                <div class="container-login">
                    <c:forEach items="${session.getMarketModel().getMarketLineModel()}" var="market">
                        <tr>
                            <td>${market.getProductsModel().getName()} </td>
                            <td>${market.getFinalPrice()} </td>
                            <td>${market.getQuantity()} </td>
                            <td><fmt:formatNumber type="number" maxFractionDigits="2" value=" ${market.getProductsModel().getCatalogPrice() * market.getQuantity()}"/></td>
                        </tr>
                    </c:forEach>

                </div>
            </table>

            <h4> TOTAL : ${totalCommand} €</h4>
                <h3>Doit vérifier si log avant</h3>
            <a href="<spring:url value='/home'/>"><button class="buttonNavBar" type="button">Confirmer et payer</button></a>


        </div>
    </div>

</div>

</body>
</html>