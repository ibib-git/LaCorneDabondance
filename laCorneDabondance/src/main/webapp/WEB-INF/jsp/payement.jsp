<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp" %>
<%@page contentType="text/html; charset=UTF-8" %>

<html lang="fr">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
</head>
<body>

<div class="container-title">
    <h2><spring:message code="paye"/></h2>



    <div class="flex-container">

        <div>

            <h4><spring:message code="numberCommand"/>${session.getMarketModel().getIdOrder()}</h4>
            <h5><spring:message code="totalCommand"/>${totalCommand} €</h5>

        </div>
        <div>
            <form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
                <input type="hidden" name="cmd" value="_s-xclick">
                <input type="hidden" name="hosted_button_id" value="GGVLE2YM2KASY">
                <input type="image" src="https://www.paypalobjects.com/en_US/BE/i/btn/btn_paynowCC_LG.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
                <img alt="" border="0" src="https://www.paypalobjects.com/en_US/i/scr/pixel.gif" width="1" height="1">
            </form>
        </div>

    </div>

</div>

</body>
</html>