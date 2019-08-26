<%@include file="../include/importTags.jsp"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>

<head>
    <title>${title}</title>
    <link rel="icon" href="<spring:url value='/images/corn-in-fruta.ico'/>"/>
    <link type="text/css" rel="stylesheet" href="<spring:url value='/css/styles.css'/>"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
</head>

<body>
<!-- Header -->
<div class="header" style="background-image: url('<spring:url value="/images/Corne-dAbondance.jpg"/>')";>
    <h1>La Corne d'Abondance</h1>
    <p><spring:message code="topHome"/></p>
</div>

<!-- Navigation Bar -->
<ul class="navbar">
    <li><a href="<spring:url value='/home'/>"><spring:message code="home"/></a></li>
    <li class="dropdown">
        <a href="#category"><spring:message code="category"/></a>
        <div class="dropdown-content">
            <a href="<spring:url value='/products/fruits'/>"><spring:message code="fruit"/></a>
            <a href="<spring:url value='/products/legumes'/>"><spring:message code="vegetable"/></a>
        </div></li>
    <li><a href="<spring:url value='/products/calendar'/>"><spring:message code="calendar"/></a></li>
    <li><a href="<spring:url value='/home/contact'/>"><spring:message code="contact"/></a></li>
    <spring:url var="localeFr" value="">
        <spring:param name="locale" value="fr"/>
    </spring:url>
    <spring:url var="localeEn" value="">
        <spring:param name="locale" value="en"/>
    </spring:url>
    <li class="right"><a href="${localeFr}" class="language-select"><img class="icon" src="<spring:url value='/images/french-flag.png'/>" alt="frenchFlag"/></a></li>
    <li class="right"><a href="${localeEn}" class="language-select"><img class="icon" src='<spring:url value="/images/english-flag.jpg"/>' alt="englishFlag"/></a></li>
    <li class="right"><a onclick="document.getElementById('panier').style.display='block'" style="width:auto;"><img class="icon" src='<spring:url value="/images/panier.png"/>' alt="shopIcon"></a></li>
    <sec:authorize access="!isAuthenticated()">
        <li class="right"><a><button onclick="document.getElementById('log').style.display='block'" style="width:auto;"  class="buttonNavBar"><spring:message code="login-button"/></button></a></li>
    </sec:authorize>
    <sec:authorize access="isAuthenticated()">
        <li class="right"><a onclick="document.getElementById('signIn').style.display='block'" style="width:auto;"><img class="icon" src="<spring:url value='/images/person-icon.png'/>" alt="signIcon"/></a></li>
    </sec:authorize>


</ul>

<div id="log" class="modal">

    <form class="modal-content animate">
        <div class="img-login">
            <span onclick="document.getElementById('log').style.display='none'" class="close" title="Close Modal">&times;</span>
            <img src='<spring:url value="/images/corn-in-fruta.png"/>' alt="logPicture" class="avatar">
        </div>

        <div class="container-login">
            <form:form action="/laCorneDabondance/signUp/login" id="login" method="post" modelAttribute="userEntity">

                <form:label path="username"><b><spring:message code="username"/></b></form:label>
            <form:input path="username" type="text" class="login" placeholder="Entrer votre Identifiant" name="uname" required="required" />

                <form:label path="password"><b><spring:message code="password"/></b></form:label>
            <form:input path="password" type="password" class="login" placeholder="Entrer votre mot de passe" name="psw" required="required"/>

            <form:button class="button-login" type="submit"><spring:message code="validate"/> </form:button>
            </form:form>

            <a href="<spring:url value='/signUp'/>"><button class="button-register" type="button"><spring:message code="signUp"/></button></a>

        </div>



        <div class="container" style="background-color:#f1f1f1">
            <button type="button" onclick="document.getElementById('log').style.display='none'" class="cancelbtn">Annuler<spring:message code="return"/> </button>
        </div>
    </form>
</div>



<div id="panier" class="modal">

    <form class="modal-content animate">
        <div class="img-login">
            <span onclick="document.getElementById('panier').style.display='none'" class="close" title="Close Modal"></span>
            <img src='<spring:url value="/images/images-ico.ico"/>' alt="logPicture" class="avatar">
            <h3><spring:message code="market"/></h3>
        </div>
    <table>

        <tr>
            <th><spring:message code="nameProduct"/></th>
            <th><spring:message code="priceProduct"/></th>
            <th><spring:message code="quantity"/></th>
            <th><spring:message code="total"/></th>
        </tr>

        <div class="container-login">
            <c:forEach items="${session.getMarketModel().getMarketLineModel()}" var="market">
                <tr>
                    <td>${market.getProductsModel().getName()} </td>
                    <td>${market.getProductsModel().getCatalogPrice()} </td>
                    <td>${market.getQuantity()} </td>
                    <td><fmt:formatNumber type="number" maxFractionDigits="2" value=" ${market.getProductsModel().getCatalogPrice() * market.getQuantity()}"/></td>
                    <td><a href="<spring:url value='/products/updateProduct/${market.getIdLine()}'/>"><button class="buttonNavBar" type="button" style="background-color: cornflowerblue"><spring:message code="modif"/></button></a></td>
                    <td><a href="<spring:url value='/products/deleteProduct/${market.getIdLine()}'/>"><button class="buttonNavBar" type="button" style="background-color: red"><spring:message code="delete"/></button></a></td>


                </tr>
            </c:forEach>

        </div>


    </table>



        <div class="container" style="background-color:#f1f1f1">
        <a href="<spring:url value='/command'/>"><button type="button" onclick="document.getElementById('panier').style.display='none'" class="button-login"><spring:message code="toCommand"/></button></a>
            <button type="button" onclick="document.getElementById('panier').style.display='none'" class="cancelbtn"><spring:message code="return"/></button>
        </div>
    </form>
</div>


<div id="signIn" class="modal">

    <div class="img-login">
        <span onclick="document.getElementById('signIn').style.display='none'" class="close" title="Close Modal"></span>
        <h3>${user.getUser()}</h3>
    </div>

        <div class="container-login">
            <label><b>${user.getFirstName()}</b></label>
            <label><b>${user.getLastName()}</b></label>

            <a href="<spring:url value='/signUp/profile'/>"><button class="button-register" type="button"><spring:message code="profile"/></button></a>

        </div>



        <div class="container" style="background-color:#f1f1f1">
            <button type="button" onclick="document.getElementById('signIn').style.display='none'" class="cancelbtn"><spring:message code="return"/></button>
        </div>
</div>



<script>
    // Get the modal
    var modal = document.getElementById('log');
    var modalPanier = document.getElementById('panier');
    var modalUser = document.getElementById('signIn');



    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }

        if (event.target == modalPanier) {
            modalPanier.style.display = "none";
        }

        if (event.target == modal) {
            modalUser.style.display = "none";
        }
    }


</script>




<!-- Main content -->

<div>
    <div>
        <tiles:insertAttribute name="main-content"/>
    </div>
</div>



<!-- Footer -->
<div class="footer">
    <spring:message code="footer"/>

    <P>© Fricot Damien </P>
</div>

</body>


</html>