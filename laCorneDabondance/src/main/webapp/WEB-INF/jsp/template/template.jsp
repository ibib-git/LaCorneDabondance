<%@include file="../include/importTags.jsp"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>
<html lang="fr">

<head>
    <title>La Corne d'abondance</title>
    <link type="text/css" rel="stylesheet" href="<spring:url value='/css/styles.css'/>"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>
<!-- Header -->
<div class="header">
    <h1>La Corne d'abondance</h1>
    <p>Vente de fruits et legumes belges</p>
</div>

<!-- Navigation Bar -->
<ul class="navbar">
    <li><a href="#home">Accueil</a></li>
    <li class="dropdown">
        <a href="#category">Categorie</a>
        <div class="dropdown-content">
            <a href="#catFruits">Fruits</a>
            <a href="#catLegumes">Legumes</a>
        </div></li>
    <li><a href="#calendar">Calendrier</a></li>
    <li><a href="#contact">Contact</a></li>
    <li class="right"><a href="#frenchFlag"><img class="icon" src="<spring:url value='/images/french-flag.png'/>" alt="frenchFlag"/></a></li>
    <li class="right"><a href="#englishFlag"><img class="icon" src='<spring:url value="/images/english-flag.jpg"/>' alt="englishFlag"/></a></li>
    <li class="right"><a href="#shopIcon"><img class="icon" src='<spring:url value="/images/panier.png"/>' alt="shopIcon"></a></li>
    <li class="right"><a href="#connexion"><button class="buttonNavBar">Inscription/Connexion</button></a></li>

    <li class="search-container">
        <a>
            <form action="/action_page.php">
                <input type="text" placeholder="Rechercher.." name="search">
                <button type="submit"><i class="fa fa-search"></i></button>
            </form>
        </a>
    </li>

</ul>

<!-- Main content -->

<div>
    <div>
        <tiles:insertAttribute name="main-content"/>
    </div>
</div>



<!-- Footer -->
<div class="footer">
    <h3>Qui sommes nous ?</h3>
    <p>Projet etudiant cree en 2019,la corne d'abondance a pour vocation de faciliter la vente de produits issuent de l'agriculture belge. <br>
        Cette platforme en ligne est l'idee de la mise en relation de producteurs locaux. <br>
    </p>

    <P>© Fricot Damien </P>
</div>

</body>


</html>