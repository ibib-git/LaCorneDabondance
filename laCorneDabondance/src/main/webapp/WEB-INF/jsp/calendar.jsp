<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp" %>
<%@page contentType="text/html; charset=UTF-8" %>

<html lang="fr">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
</head>
<body>

<div class="container-title">
    <h2>Calendrier</h2>



    <div class="flex-container">
        <div>
            <iframe src="https://calendar.google.com/calendar/embed?height=350&amp;wkst=2&amp;bgcolor=%23ffffff&amp;ctz=Europe%2FBrussels&amp;src=b3ZnazdkOXVxNzBvNDFxMGVyMzMzOWZwMTRAZ3JvdXAuY2FsZW5kYXIuZ29vZ2xlLmNvbQ&amp;color=%23F4511E&amp;showDate=1&amp;showTabs=0&amp;showCalendars=0&amp;showTz=0" style="border-width:0" width="350" height="350" frameborder="0" scrolling="no"></iframe>

        </div>
        <div class="test-table">
            <table>
                <tr>
                    <th>Intitulé</th>
                    <th>Saison</th>
                    <th>Catégorie</th>
                    <th>disponibilité</th>
                    <th>Variétés disponibles</th>

                </tr>


                    <c:forEach items="${productsList}" var="product">
                        <a style="cursor: pointer" href="<spring:url value='/products/detail/${product.getId()}'  />">
                            <tr>
                                <td>${product.getName()}</td>
                                <td>${product.getSeasonStart().get(Calendar.MONTH)}<br>${product.getSeasonEnd().get(Calendar.MONTH)}</td>
                                <td>Fruits/légume à changer</td>
                                <td>
                                    <c:choose>
                                        <c:when test="${product.getQuantity() > 0}">oui</c:when>
                                    <c:otherwise>non</c:otherwise>
                                </c:choose>
                                </td>
                                <td>${product.getVariety()}</td>
                            </tr>
                        </a>

                    </c:forEach>


            </table>
        </div>
    </div>

</div>

</body>
</html>