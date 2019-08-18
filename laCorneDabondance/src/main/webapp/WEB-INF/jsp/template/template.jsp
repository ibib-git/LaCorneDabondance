<%@include file="../include/importTags.jsp"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="fr">

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
    <h1>La Corne d'abondance</h1>
    <p>Vente de fruits et légumes belges</p>
</div>

<!-- Navigation Bar -->
<ul class="navbar">
    <li><a href="<spring:url value='/home'/>">Accueil</a></li>
    <li class="dropdown">
        <a href="#category">Catégorie</a>
        <div class="dropdown-content">
            <a href="<spring:url value='/products/fruits'/>">Fruits</a>
            <a href="<spring:url value='/products/legumes'/>">Légumes</a>
        </div></li>
    <li><a href="<spring:url value='/products/calendar'/>">Calendrier</a></li>
    <li><a href="<spring:url value='/home/contact'/>">Contact</a></li>
    <li class="right"><a href="#frenchFlag"><img class="icon" src="<spring:url value='/images/french-flag.png'/>" alt="frenchFlag"/></a></li>
    <li class="right"><a href="#englishFlag"><img class="icon" src='<spring:url value="/images/english-flag.jpg"/>' alt="englishFlag"/></a></li>
    <li class="right"><a onclick="document.getElementById('panier').style.display='block'" style="width:auto;"><img class="icon" src='<spring:url value="/images/panier.png"/>' alt="shopIcon"></a></li>
    <li class="right"><a><button onclick="document.getElementById('log').style.display='block'" style="width:auto;"  class="buttonNavBar">Inscription/Connexion</button></a></li>

</ul>

<div id="log" class="modal">

    <form class="modal-content animate">
        <div class="img-user">
            <span onclick="document.getElementById('log').style.display='none'" class="close" title="Close Modal">&times;</span>
            <img src='<spring:url value="/images/corn-in-fruta.png"/>' alt="logPicture" class="avatar">
        </div>

        <div class="container-user">
            <label><b>Identifiant</b></label>
            <input type="text" class="user" placeholder="Entrer votre Identifiant" name="uname" required>

            <label><b>Mot de passe</b></label>
            <input type="password" class="user" placeholder="Entrer votre mot de passe" name="psw" required>

            <button class="button-user" type="submit">Valider</button>
            <a href="<spring:url value='/signUp'/>"><button class="button-register" type="button">Nouvelle inscription</button></a>

        </div>



        <div class="container" style="background-color:#f1f1f1">
            <button type="button" onclick="document.getElementById('log').style.display='none'" class="cancelbtn">Annuler</button>
        </div>
    </form>
</div>



<div id="panier" class="modal">

    <form class="modal-content animate">
        <div class="img-user">
            <span onclick="document.getElementById('panier').style.display='none'" class="close" title="Close Modal">&times;</span>
            <img src='<spring:url value="/images/images-ico.ico"/>' alt="logPicture" class="avatar">
            <h3>Panier de la commande</h3>
        </div>
    <table>

        <tr>
            <th>Nom du produit</th>
            <th>Prix unitaire (€)</th>
            <th>Quantité</th>
            <th>Total (€)</th>
        </tr>

        <div class="container-user">
            <c:forEach items="${session.getMarketModel().getMarketLineModel()}" var="market">
                <tr>
                    <td>${market.getProductsModel().getName()} </td>
                    <td>${market.getProductsModel().getCatalogPrice()} </td>
                    <td>${market.getQuantity()} </td>
                    <td><fmt:formatNumber type="number" maxFractionDigits="2" value=" ${market.getProductsModel().getCatalogPrice() * market.getQuantity()}"/></td>
                    <td><a href="<spring:url value='/products/updateProduct/${market.getIdLine()}'/>"><button class="buttonNavBar" type="button" style="background-color: cornflowerblue">Modifier</button></a></td>
                    <td><a href="<spring:url value='/products/deleteProduct/${market.getIdLine()}'/>"><button class="buttonNavBar" type="button" style="background-color: red">Supprimer</button></a></td>


                </tr>
            </c:forEach>

        </div>


    </table>



        <div class="container" style="background-color:#f1f1f1">
            <a href="<spring:url value='/command'/>"><button type="button" onclick="document.getElementById('panier').style.display='none'" class="button-user">Commander</button></a>
            <button type="button" onclick="document.getElementById('panier').style.display='none'" class="cancelbtn">Annuler</button>
        </div>
    </form>
</div>



<script>
    // Get the modal
    var modal = document.getElementById('log');
    var modalPanier = document.getElementById('panier');


    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }

        if (event.target == modalPanier) {
            modalPanier.style.display = "none";
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
    <h3>Qui sommes nous ?</h3>
    <p>Projet étudiant créé en 2019,la corne d'abondance a pour vocation de faciliter la vente de produits issuent de l'agriculture belge. <br>
        Cette platforme en ligne est l'idée de la mise en relation de producteurs locaux. <br>
    </p>

    <P>© Fricot Damien </P>
</div>

</body>


</html>