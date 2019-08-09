<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp" %>
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
                <tr>
                    <td><a href="product-pomme">Pomme</a></td>
                    <td>Janvier<br>Decembre</td>
                    <td>Fruits</td>
                    <td>oui</td>
                    <td>Golden<br>Ariane<br>Grany</td>
                </tr>
                <tr>
                    <td><a href="product-artichaut">Artichaut</a></td>
                    <td>Avril<br>Septembre</td>
                    <td>Legume</td>
                    <td>non</td>
                    <td>/</td>
                </tr>
            </table>
        </div>
    </div>

</div>

</body>
</html>