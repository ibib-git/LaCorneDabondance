<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp" %>
<%@page contentType="text/html; charset=UTF-8" %>

<html lang="fr">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
</head>
<body>

<div class="container-title">
    <h2><spring:message code="command"/></h2>


    <div class="flex-container">

        <div class="test-table">
            <table>

                <tr>
                    <th><spring:message code="nameProduct"/></th>
                    <th><spring:message code="priceReduc"/></th>
                    <th><spring:message code="quantity"/></th>
                    <th><spring:message code="total"/></th>
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

            <h4> <spring:message code="totalCommand"/> ${totalCommand}</h4>
                <h3>Doit vérifier si log avant</h3>
            <a href="<spring:url value='/command/toPay'/>"><button class="buttonNavBar" type="button"><spring:message code="confirmAndPay"/></button></a>


        </div>
    </div>

</div>

</body>
</html>