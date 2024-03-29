<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp" %>
<%@page contentType="text/html; charset=UTF-8" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
</head>
<body>
<!--Container-->

<div class="container-title">
    <h1><spring:message code="detailProduct"/> </h1>
    <p><h2>${detailName}</h2></p>

    <div class="flex-container">

        <div>

            <img class="image-product" src='<spring:url value="/images/${detailImage}"/>' alt="img-${detailName}">
            <h3></h3>
            <h3>${detailScient}</h3>
            <h4> <spring:message code="variety"/> : ${detailVariety}</h4>
            <p>${detailDesc}</p>
            <h4><spring:message code="season"/><spring:message code="from"/> ${detailSeasonStart} <spring:message code="to"/> ${detailSeasonEnd}</h4>
            <h4><spring:message code="lifespan"/> : ${detailLife} <spring:message code="day"/> </h4>
            <h4>${detailPrice} €/Kg </h4>
            <c:choose>
                <c:when test="${detailQuant > 0}">

            <form:form action="/laCorneDabondance/products/addProduct" id="addProduct" method="post" modelAttribute="session">
               <form:label path="orderQuantity"><spring:message code="quantity"/> :</form:label>
                <form:input path="orderQuantity" type="number"  name="quantity" value="${defaultValue}" min="1" max="${detailQuant}" id='inputCommand' />
                <form:button ><spring:message code="addMArket"/></form:button>

            </form:form>
                </c:when>

                <c:when test="${idLineUpdate > 0}">
                    <form:form action="/laCorneDabondance/products/updateQuantProduct/${idLineUpdate}" id="updateQuantProduct" method="post" modelAttribute="session">
                        <form:label path="updateQuantity"><spring:message code="quantity"/> :</form:label>
                        <form:input path="updateQuantity" type="number"  name="quantity" value="${defaultValue}" min="1" max="${detailQuant}" id='updateCommand' />
                        <form:button ><spring:message code="modifMarket"/></form:button>

                    </form:form>

                </c:when>
                <c:otherwise><p><spring:message code="noDispo"/></p></c:otherwise>
            </c:choose>
        </div>

        <form:form action="/laCorneDabondance/products/return" id="return" method="post" modelAttribute="session">
        <button class="cancelbtn" ><spring:message code="return"/></button>
        </form:form>


    </div>


</div>




</body>
</html>