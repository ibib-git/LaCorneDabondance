<%@ include file="../include/importTags.jsp"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <link type = "text/css" href="<spring:url value='/css/example.css'/>"
          rel="stylesheet">
</head>
<body>

<!--header-->

<!-- HEADER -->
<header class="header">
    <a class="logo"><img src="<spring:url value='/image/panier.jpg'/>"></a>
</header>
<div class="separator"></div>
<div class="flat"></div>

<div>
    <div>
        <tiles:insertAttribute name = "main-content" />
    </div>
</div>

<!--footer-->
<div class="separator"></div>
<footer class="footer">
    <div class="copyright">
        <h1>Copyright 2018 .... - Tous droits reserves.</h1>
    </div>
</footer>

</body>
</html>
