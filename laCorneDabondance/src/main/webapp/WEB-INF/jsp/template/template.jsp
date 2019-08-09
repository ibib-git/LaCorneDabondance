<%@include file="../include/importTags.jsp"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>
<html lang="fr">

<head>
    <title>${title}</title>
    <link rel="icon" href="<spring:url value='/images/corn-in-fruta.ico'/>"/>
    <link type="text/css" rel="stylesheet" href="<spring:url value='/css/styles.css'/>"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>
<!-- Header -->
<div class="header" style="background-image: url('<spring:url value="/images/Corne-dAbondance.jpg"/>')";>
    <h1>La Corne d'abondance</h1>
    <p>Vente de fruits et legumes belges</p>
</div>

<!-- Navigation Bar -->
<ul class="navbar">
    <li><a href="<spring:url value='/home'/>">Accueil</a></li>
    <li class="dropdown">
        <a href="#category">Categorie</a>
        <div class="dropdown-content">
            <a href="<spring:url value='/products'/>">Fruits</a>
            <a href="#catLegumes">Legumes</a>
        </div></li>
    <li><a href="<spring:url value='/home/calendar'/>">Calendrier</a></li>
    <li><a href="<spring:url value='/home/contact'/>">Contact</a></li>
    <li class="right"><a href="#frenchFlag"><img class="icon" src="<spring:url value='/images/french-flag.png'/>" alt="frenchFlag"/></a></li>
    <li class="right"><a href="#englishFlag"><img class="icon" src='<spring:url value="/images/english-flag.jpg"/>' alt="englishFlag"/></a></li>
    <li class="right"><a href="#shopIcon"><img class="icon" src='<spring:url value="/images/panier.png"/>' alt="shopIcon"></a></li>
    <li class="right"><a><button onclick="document.getElementById('id01').style.display='block'" style="width:auto;"  class="buttonNavBar">Inscription/Connexion</button></a></li>

    <li class="search-container">
        <a>
            <form>
                <input type="text" placeholder="Rechercher.." name="search">
            </form>
        </a>
    </li>

</ul>

<div id="id01" class="modal">

    <form class="modal-content animate">
        <div class="img-login">
            <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
            <img src='<spring:url value="/images/corn-in-fruta.png"/>' alt="logPicture" class="avatar">
        </div>

        <div class="container-login">
            <label><b>Identifiant</b></label>
            <input type="text" class="login" placeholder="Entrer votre Identifiant" name="uname" required>

            <label><b>Mot de passe</b></label>
            <input type="password" class="login" placeholder="Entrer votre mot de passe" name="psw" required>

            <button class="button-login" type="submit">Valider</button>
            <a href="<spring:url value='/signUp'/>"><button class="button-register" type="button">Nouvelle inscription</button></a>

        </div>



        <div class="container" style="background-color:#f1f1f1">
            <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Annuler</button>
            <span class="psw"><a href="#">Mot de passe oublié ?</a></span>
        </div>
    </form>
</div>



<script>
    // Get the modal
    var modal = document.getElementById('id01');

    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
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
    <p>Projet etudiant cree en 2019,la corne d'abondance a pour vocation de faciliter la vente de produits issuent de l'agriculture belge. <br>
        Cette platforme en ligne est l'idee de la mise en relation de producteurs locaux. <br>
    </p>

    <P>© Fricot Damien </P>
</div>

</body>


</html>